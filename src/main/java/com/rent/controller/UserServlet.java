package com.rent.controller;

import com.google.gson.Gson;
import com.rent.container.ApplicationContainer;
import com.rent.dto.HouseInfoDto;
import com.rent.enumerate.AssertNullType;
import com.rent.pojo.User;
import com.rent.service.UserService;
import com.rent.utils.AssertNullOfTypeUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-07 20:19
 **/
public class UserServlet extends BaseServlet {

    //    @Autowired
    private UserService userService;

    {
        userService = ApplicationContainer.getApplicationContext(ApplicationContainer.key).getBean(UserService.class);
    }

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        //获取请求参数
        String username = req.getParameter("uname");
        String password = req.getParameter("upass");
        map.put("uname", username);
        map.put("upass", password);
        //判断参数是否为空
        if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.StringType, username) && AssertNullOfTypeUtil.doAssertNull(AssertNullType.StringType, password)) {
            User user = userService.login(map);
            if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.ObjectType, user)) {
                //登陆成功
                //将登陆成功的用户保存到session域中
                req.getSession().setAttribute("user", user);
//                resp.sendRedirect("pages/forwardToBookInfoList.jsp");
                req.getRequestDispatcher("pages/forwardToBookInfoList.jsp").forward(req, resp);
            } else {
                //登陆失败
                req.setAttribute("errorMsg", "用户名或密码错误");
                req.getRequestDispatcher("pages/login_form.jsp").forward(req, resp);
            }
        }
    }

    protected void register(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //获取请求的参数
        String username = req.getParameter("uname");
        String password = req.getParameter("upass");
        User user = new User();
        user.setUname(username);
        user.setUpass(password);
        if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.StringType, username) && AssertNullOfTypeUtil.doAssertNull(AssertNullType.StringType, password)) {
            boolean b = userService.queryUserByUsername(username);
            if (b) {
                boolean saveUser = userService.saveUser(user);
                if (saveUser) {
                    req.setAttribute("msg", "注册成功！");
                    req.getRequestDispatcher("pages/reg.jsp").forward(req, resp);
                } else {
                    req.setAttribute("msg", "注册失败！");
                    req.getRequestDispatcher("pages/reg.jsp").forward(req, resp);
                }
            } else {
                req.setAttribute("msg", "用户名已存在！");
                req.getRequestDispatcher("pages/reg.jsp").forward(req, resp);
            }
        }
    }

    protected void isExistUsername(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        // 获取请求的参数username
        String username = req.getParameter("username");
        // 调用userService.existsUsername();
        boolean existsUsername = userService.queryUserByUsername(username);
        // 把返回的结果封装成为map对象
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("existsUsername", existsUsername);

        Gson gson = new Gson();
        String json = gson.toJson(resultMap);

        resp.getWriter().write(json);
    }

    protected void logout(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        req.getSession().invalidate();
        req.getRequestDispatcher("pages/login_form.jsp").forward(req, resp);
    }

    protected void queryHouseInfoById(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String uid = req.getParameter("uid");
        if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.StringType, uid)) {
            List<HouseInfoDto> houseInfoDto = userService.queryHouseInfoByUid(uid);
            if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.ObjectType,houseInfoDto)){
                req.setAttribute("myHouseInfo",houseInfoDto);
                req.getRequestDispatcher("pages/my.jsp").forward(req,resp);
            }
        }
    }

}
