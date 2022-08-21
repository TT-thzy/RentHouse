<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<HTML>
<HEAD>
    <TITLE>北京出租房</TITLE>
    <%@ include file="/pages/common/header.jsp" %>
    <script lang="javascript">

        $(function () {
            $("#username").blur(function () {
                // alert(1);
                //1 获取用户名
                var username = this.value;
                $.getJSON("http://localhost:8080/rent/userServlet", "action=isExistUsername&username=" + username, function (data) {
                    if (data.existsUsername) {
                        $("span.errorMsg").text("用户名可用！");
                    } else {
                        $("span.errorMsg").text("用户名已存在！");
                    }
                });
            });
        })

        function pass() {
            var pass = false;
            if (document.myForm.uname.value == "") {
                alert("用户名不能为空");
                pass = false;
            } else if (document.myForm.upass.value == "") {
                alert("密码不能为空");
                pass = false;
            } else if (document.myForm.upass.value != document.myForm.upass1.value) {
                alert("两次密码不一样");
                pass = false;
            } else {
                pass = true;
            }
            return pass;
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
                    <td><a href="pages/login_form.jsp">用户登陆</a></td>
                </tr>
            </table>
        </td>
        <td width="35" background="images/layout_24.gif">&nbsp;</td>
        <td width="495">
            <form action="userServlet" method="post" name="myForm" onsubmit="return pass()">
                <table align="center">
                    <tr>
                        <td>用户注册：</td>
                        <td>
                            <span class="errorMsg" style="color: red">
                                ${ requestScope.msg }
                            </span>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <hr/>
                        </td>
                    </tr>
                    <tr>
                        <td>用户名：</td>
                        <td><input type="text" name="uname" id="username"></td>
                    <tr>
                        <td>密码：</td>
                        <td><input type="password" name="upass"></td>
                    <tr>
                    <tr>
                        <td>重复密码：</td>
                        <td><input type="password" name="upass1"></td>
                    <tr>
                        <td><input type="hidden" name="action" value="register"></td>
                        <td><input type="submit" value="注册" class="btn">&nbsp;</td>
                        <td><input type="reset" value="重置" class="btn"></td>
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
<br/>
</BODY>
</HTML>