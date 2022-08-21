//package com.rent.filter;
//
//
//import com.rent.pojo.User;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//
///**
// * @program: RentingHouse
// * @description: 模仿权限控制 暴力控制
// * @author: Mr.Wang
// * @create: 2022-01-10 15:22
// **/
//public class PermissionFilter implements Filter {
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest request= (HttpServletRequest)servletRequest;
//        User user = (User) request.getSession().getAttribute("user");
//        if (user==null){
//            request.getRequestDispatcher("pages/login_form.jsp").forward(servletRequest,servletResponse);
//        }else {
//            filterChain.doFilter(servletRequest,servletResponse);
//        }
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
