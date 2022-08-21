<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<HTML>
<HEAD>
    <TITLE>北京出租房</TITLE>
    <%@ include file="/pages/common/header.jsp" %>

</HEAD>
<BODY BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0>

<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
        <td colspan="5"><img src="images/top.jpg" width="780" height="213"></td>
    </tr>
    <tr>
        <td colspan="5"><img src="images/middle1.jpg" width="780" height="47"></td>
    </tr>
    <tr>
        <td width="38" background="images/middle2.jpg">&nbsp;</td>
        <td width="172" valign="top">

            <script language="javascript">


               $(function () {
                   $("#deleteHouseInfo").click(function () {
                       if (confirm("是否要删除此房屋信息")) {
                           return true;
                       } else {
                           return false;
                       }
                   })
               })


                <!--
                    function login(){
                        if( document.myForm.uname.value =="" ){
                            alert("用户名不能为空");
                            return false;
                        }else if(document.myForm.upass.value == ""){
                            alert("密码不能为空");
                            return false;
                        } else {
                            return true;
                        }
                    }
                -->
            </script>

            <table align="center">
                <%@ include file="common/currentUser.jsp" %>
                <%@ include file="common/Menu.jsp" %>
            </table>
        </td>
        <td width="35" background="images/layout_24.gif">&nbsp;</td>
        <td width="495">
            <table>
                <tr>
                    <td width="3%">&nbsp;</td>
                    <td width="97%">


                        <table width='450' border='0'>
                            <tr>
                                <TD>标题</TD>
                                <TD width='100' align='center'>月租金</TD>
                                <TD width='110' align='center'>发布日期</TD>
                                <TD width='50'>&nbsp;</TD>
                                <TD width='50'>&nbsp;</TD>
                            </tr>
                            <tr>
                                <td colspan='5'>
                                    <hr/>
                                </td>
                            </tr>

                            <c:forEach items="${requestScope.myHouseInfo}" var="house">
                                <tr>
                                    <td>
                                        <a href='houseInfoServlet?action=getHouseDetail&fwid=${house.fwid}'>${house.title}</a>
                                    </td>
                                    <td align='center' style='height:30px;'>${house.zj}元</td>
                                    <td align='center' style='height:30px;'>${house.date}</td>
                                    <td align='center' style='height:30px;'><a
                                            href='houseInfoServlet?action=deleteHouseDetail&fwid=${house.fwid}'
                                            id="deleteHouseInfo">[删除]</a></td>
                                    <td align='center' style='height:30px;'><a
                                            href='houseInfoServlet?action=initUpdateData&fwid=${house.fwid}'>[修改]</a>
                                    </td>
                                </tr>
                            </c:forEach>

                            <tr>
                                <td colspan='5'>
                                    <hr/>
                                </td>
                            </tr>
                        </table>


                    </td>
                </tr>
                <tr>
                    <td colspan="2"></td>
                </tr>
            </table>
        </td>
        <td width="40" background="images/middle4.jpg">&nbsp;</td>
    </tr>
    <tr>
        <td colspan="5"><img src="images/bottom.jpg" width="780" height="82"></td>
    </tr>
</table>
<%@ include file="common/footer.jsp" %>
</BODY>
</HTML>