package com.rent.controller;

import com.google.gson.Gson;
import com.rent.container.ApplicationContainer;
import com.rent.dto.*;
import com.rent.enumerate.AssertNullType;
import com.rent.mapper.TestMapper;
import com.rent.pojo.*;
import com.rent.service.DistrictsService;
import com.rent.service.HouseInfoService;
import com.rent.service.HouseTypeService;
import com.rent.service.StreetService;
import com.rent.utils.AssertNullOfTypeUtil;
import com.rent.utils.ChangeType;
import com.rent.utils.DateUtil;
import com.rent.utils.HouseInfoPostDtoUtil;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-07 20:21
 **/
public class HouseInfoServlet extends BaseServlet {

    //    @Autowired
    private HouseInfoService houseInfoService;
    private DistrictsService districtsService;
    private HouseTypeService houseTypeService;
    private StreetService streetService;

    {
        houseInfoService = ApplicationContainer.getApplicationContext(ApplicationContainer.key).getBean(HouseInfoService.class);
        districtsService = ApplicationContainer.getApplicationContext(ApplicationContainer.key).getBean(DistrictsService.class);
        houseTypeService = ApplicationContainer.getApplicationContext(ApplicationContainer.key).getBean(HouseTypeService.class);
        streetService = ApplicationContainer.getApplicationContext(ApplicationContainer.key).getBean(StreetService.class);
    }

    /**
    *@Description: 初始化主页
    *@Param:
    *@return:
    */
    protected void queryHouseInfo(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        List<HouseInfoDto> infoDtoList = houseInfoService.queryHouseInfo();
        List<Districts> districtsList = districtsService.findAll();
        req.setAttribute("HouseInfos", infoDtoList);
        req.setAttribute("districtsList",districtsList);
        req.getRequestDispatcher("pages/login.jsp").forward(req, resp);
    }

    /**
    *@Description: 查询房屋详情
    *@Param:
    *@return:
    */
    protected void getHouseDetail(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String fwid = req.getParameter("fwid");
        Integer i = ChangeType.parseInt(fwid, -1);
        if (i != -1) {
            HouseInfoDetailDto houseInfoDetailDto = houseInfoService.queryHouseInfoDetail(i);
            if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.ObjectType, houseInfoDetailDto)) {
                req.setAttribute("houseInfoDetail", houseInfoDetailDto);
                req.getRequestDispatcher("pages/detail.jsp").forward(req, resp);
            }
        }
    }

    /**
    *@Description: 删除房屋信息
    *@Param:
    *@return:
    */
    protected void deleteHouseDetail(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        User user = (User) req.getSession().getAttribute("user");
        String fwid = req.getParameter("fwid");
        Integer i = ChangeType.parseInt(fwid, -1);
        if (i != -1) {
            boolean b = houseInfoService.deleteHouseInfoById(i);
            if (b) {
                req.getRequestDispatcher("userServlet?action=queryHouseInfoById&uid=" + user.getUid()).forward(req, resp);
            }
        }
    }

    /**
     * @Description: 初始话房屋发布信息界面(区县, 房屋类型)
     * @Param: HttpServletRequest req,HttpServletResponse resp
     * @return:
     */
    protected void initData(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        List<Districts> DistrictsList = districtsService.findAll();
        List<HouseType> HouseTypeList = houseTypeService.findAll();
        req.setAttribute("districtsList", DistrictsList);
        req.setAttribute("houseTypeList", HouseTypeList);
        req.getRequestDispatcher("pages/post.jsp").forward(req, resp);
    }

    /**
    *@Description: 初始化发布界面
    *@Param:
    *@return:
    */
    protected void goToSubmit(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Map<String, String[]> parameterMap = req.getParameterMap();
        HouseInfoPostDto dto = new HouseInfoPostDto();
        HouseInfoPostDto houseInfoPostDto = ChangeType.copyParamToBean(parameterMap, dto);
        HouseInfoPostDto postDto = HouseInfoPostDtoUtil.power(houseInfoPostDto, streetService, houseTypeService);
        req.setAttribute("houseInfoPostDto", postDto);
        req.getRequestDispatcher("pages/post_confirm.jsp").forward(req, resp);
    }

    /**
    *@Description: 发布房屋信息
    *@Param:
    *@return:
    */
    protected void publish(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        User user = (User) req.getSession().getAttribute("user");
        Map<String, String[]> parameterMap = req.getParameterMap();
        HouseInfo houseInfo = new HouseInfo();
        HouseInfo info = ChangeType.copyParamToBean(parameterMap, houseInfo);
        String date = req.getParameter("date");
        info.setLxr(req.getParameter("lxr"));
        info.setTelephone(req.getParameter("telephone"));
        info.setDate(DateUtil.stringToDate(date, "yyyy-MM-dd hh:mm:ss"));
        boolean b = houseInfoService.saveHouseInfo(info);
        if (b) {
            req.getRequestDispatcher("userServlet?action=queryHouseInfoById&uid=" + user.getUid()).forward(req, resp);
        }
    }

    /**
    *@Description: 初始化更新界面
    *@Param:
    *@return:
    */
    protected void initUpdateData(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String fwid = req.getParameter("fwid");
        int id = ChangeType.parseInt(fwid, -1);
        HouseInfo houseInfo=null;
        if (id != -1) {
            houseInfo = houseInfoService.queryHouseInfoById(id);
            req.setAttribute("houseInfo",houseInfo);
        }
        Street street = streetService.queryStreetById(houseInfo.getJdid());
        List<Districts> DistrictsList = districtsService.findAll();
        List<HouseType> HouseTypeList = houseTypeService.findAll();
        req.setAttribute("street",street);
        req.setAttribute("districtsList", DistrictsList);
        req.setAttribute("houseTypeList", HouseTypeList);
        req.getRequestDispatcher("pages/update.jsp").forward(req,resp);
    }

    /**
    *@Description: 更新房屋信息
    *@Param:
    *@return:
    */
    protected void updateHouseInfo(HttpServletRequest req, HttpServletResponse resp) throws Exception{
        User user = (User) req.getSession().getAttribute("user");
        Map<String, String[]> parameterMap = req.getParameterMap();
        HouseInfo houseInfo = new HouseInfo();
        HouseInfo info = ChangeType.copyParamToBean(parameterMap, houseInfo);
        boolean b = houseInfoService.updateHouseInfo(info);
        if (b){
            req.getRequestDispatcher("userServlet?action=queryHouseInfoById&uid=" + user.getUid()).forward(req, resp);
        }
    }

    /**
    *@Description: 多条件查询
    *@Param:
    *@return:
    */
    protected void MultiConditionQuery(HttpServletRequest req, HttpServletResponse resp) throws Exception{
        Map<String, String[]> parameterMap = req.getParameterMap();
        HouseInfoQueryDto houseInfoQueryDto = new HouseInfoQueryDto();
        HouseInfoQueryDto queryDto = ChangeType.copyParamToBean(parameterMap, houseInfoQueryDto);
//        String date = req.getParameter("date");
//        int i = ChangeType.parseInt(date, -1);
//        queryDto.setDate(i);
        List<HouseInfoDto> infoDtoList= houseInfoService.queryHouseInfoWithMultiCondition(queryDto);
        List<Districts> districtsList = districtsService.findAll();
        req.setAttribute("HouseInfos", infoDtoList);
        req.setAttribute("districtsList",districtsList);
        req.getRequestDispatcher("pages/login.jsp").forward(req, resp);
    }
}
