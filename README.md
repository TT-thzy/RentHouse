# RentHouse
房屋租赁系统

## 项目描述
一款提供给租客的在线租赁，房东在线发布房源的系统。

## 项目实用技术
spring+mybatis+servlet+jsp+前端三件套+mysql

## 部分表设计
![image-20220107155849003](https://user-images.githubusercontent.com/49704088/185789159-c34e7a3b-76d7-4e1a-9045-8c6b760e3601.png)

## 部分难点分析
* 如何在启动web应用的同时，加载spring的配置文件

  解决办法：

  1. 定义一个类去实现ServletContextListener

  2. 在web.xml中使用配置该类，并把spring的文件(path)地址放置在<context-param>标签中

  3. 在实现类中的contextInitialized()方法中：

     ```java
     ServletContext servletContext = servletContextEvent.getServletContext();
     String path= String.valueOf(servletContext.getInitParameter("path"));
     System.out.println(path);
     ApplicationContext context=new ClassPathXmlApplicationContext(path);
     //servletContext.setAttribute("context",context);
     ```

* 在高级搜索中使用多条件查询（动态sql）
