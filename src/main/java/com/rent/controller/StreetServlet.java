package com.rent.controller;

import com.google.gson.Gson;
import com.rent.container.ApplicationContainer;
import com.rent.enumerate.AssertNullType;
import com.rent.pojo.Street;
import com.rent.service.DistrictsService;
import com.rent.service.StreetService;
import com.rent.utils.AssertNullOfTypeUtil;
import com.rent.utils.ChangeType;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-07 20:20
 **/
public class StreetServlet extends BaseServlet {

    //    @Autowired
    private StreetService streetService;


    {
        streetService = ApplicationContainer.getApplicationContext(ApplicationContainer.key).getBean(StreetService.class);

    }

    protected void getStreetByQx(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String qxid = req.getParameter("qxid");
        int id = ChangeType.parseInt(qxid, -1);
        Gson gson = new Gson();
        if (id != -1) {
            List<Street> streets = streetService.queryStreetByQxid(id);
            String s = gson.toJson(streets);
            resp.getWriter().write(s);
        }
    }
}
