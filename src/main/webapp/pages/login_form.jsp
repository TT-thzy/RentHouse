<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<HTML>
<HEAD>
    <TITLE>北京出租房</TITLE>
    <%@ include file="/pages/common/header.jsp" %>
    <script lang="javascript">
        function login() {
            if (document.myForm.uname.value == "") {
                alert("用户名不能为空");
                return false;
            } else if (document.myForm.upass.value == "") {
                alert("密码不能为空");
                return false;
            } else {
                return true;
            }
        }
    </script>
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
        <td width="172">
            <table align="center">
                <tr>
                    <td><a href="pages/index.jsp">返回首页</a></td>
                </tr>
                <tr>
                    <td><a href="pages/reg.jsp">用户注册</a></td>
                </tr>
            </table>
        </td>
        <td width="35" background="images/layout_24.gif">&nbsp;</td>
        <td width="495">
            <form action="userServlet" method="post" name="myForm" onsubmit="return login()">
                <table align="center">
                    <tr>
                        <td colspan="2" align="center">

                        </td>
                    </tr>
                    <tr>
                        <td>用户登陆：</td>
                        <td><span id="errorMsg" style="color: red">
                            ${ empty requestScope.errorMsg ? "":requestScope.errorMsg }
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <hr/>
                        </td>
                    </tr>
                    <tr>
                        <td>用户名：</td>
                        <td><input type="text" name="uname"></td>
                    </tr>
                    <tr>
                        <td>密码：</td>
                        <td><input type="password" name="upass"></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="hidden" name="action" value="login"/>
                            <input type="submit" value="登陆" class="btn">
                        </td>
                    </tr>
                </table>
            </form>
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