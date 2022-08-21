<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<tr>
    <td width='150'><a href="userServlet?action=queryHouseInfoById&uid=${sessionScope.user.uid}">管理我的租房信息</a></td>
</tr>
<tr>
    <td width='100'><a href="houseInfoServlet?action=initData">发布租房信息</a></td>
</tr>
<tr>
    <td width='100'><a href="houseInfoServlet?action=queryHouseInfo">返回首页</a></td>
</tr>
<tr>
    <td width='100'><a href="userServlet?action=logout">[注销]</a></td>
</tr>