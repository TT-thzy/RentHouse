package com.rent.listener;

import com.rent.container.ApplicationContainer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @program: RentingHouse
 * @description: 监听ServletContext的创建并加载spring的配置文件
 * @author: Mr.Wang
 * @create: 2022-01-07 19:58
 **/
public class ApplicationContextInitListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ApplicationContext context = null;
        ServletContext servletContext = servletContextEvent.getServletContext();
        String path = servletContext.getInitParameter("path");
        if (path != null && path.trim().length() != 0) {
            context = new ClassPathXmlApplicationContext(path);
        }
//        servletContext.setAttribute("context", context);
        ApplicationContainer.setApplicationContext("context",context);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
