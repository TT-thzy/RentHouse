<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<HTML>
<HEAD>
<TITLE>北京出租房</TITLE>
	<%@ include file="/pages/common/header.jsp"%>
<script   language="javascript">   
function back()   
{   
	window.history.back();   
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
    <td width="172" valign="top">

<script language="javascript">
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
		<%@ include file="common/currentUser.jsp"%>
		<%@ include file="common/Menu.jsp"%>
	</table>
</td>
    <td width="35" background="images/layout_24.gif">&nbsp;</td>
    <td width="495">
	<table width="460">
	  <tr>
		<td>请确认您要发布的信息：</td>
		<td>&nbsp;</td>
	  </tr>
	  <tr>
		<td colspan="2"><hr/></td>
	  </tr>				  
	  <tr>
		<td>${houseInfoPostDto.title}<br/></td>
	  </tr>
	  <tr>
		<td><strong>电话/手机：</strong>${houseInfoPostDto.telephone}</td>
	  </tr>
	  <tr>
		<td><strong>联系人：</strong>${houseInfoPostDto.lxr}</td>
	  </tr>
	  <tr>
		<td><strong>房屋类型：</strong>${houseInfoPostDto.fwlx}</td>
	  </tr>
	  <tr>
		<td><strong>户型：</strong>${houseInfoPostDto.shi}室${houseInfoPostDto.ting}厅</td>
	  </tr>
	  <tr>
		<td><strong>价格：</strong>${houseInfoPostDto.zj}元</td>
	  </tr>
	  <tr>
		<td><strong>地段：</strong>${houseInfoPostDto.qx}区&nbsp;&nbsp;${houseInfoPostDto.jd}村</td>
	  </tr>
	  <tr>
		<td><strong>发布时间：</strong>${houseInfoPostDto.date}</td>
	  </tr>
	  <tr>
		<td><hr></td>
	  </tr>
	  <tr>
		<td>${houseInfoPostDto.fwxx}</td>
	  </tr>
	  <tr>
		<td><hr></td>
	  </tr>
	  <tr>
		<td>
		<form action="houseInfoServlet" method="POST">
			<input type="hidden" name="uid" value="${sessionScope.user.uid}"/>
			<input type="hidden" name="jdid" value="${houseInfoPostDto.jdid}"/>
			<input type="hidden" name="lxid" value="${houseInfoPostDto.lxid}"/>
			<input type="hidden" name="shi" value="${houseInfoPostDto.shi}"/>
			<input type="hidden" name="ting" value="${houseInfoPostDto.ting}"/>
			<input type="hidden" name="fwxx" value="${houseInfoPostDto.fwxx}"/>
			<input type="hidden" name="zj" value="${houseInfoPostDto.zj}"/>
			<input type="hidden" name="title" value="${houseInfoPostDto.title}"/>
			<input type="hidden" name="date" value="${houseInfoPostDto.date}"/>
			<input type="hidden" name="telephone" value="${houseInfoPostDto.telephone}"/>
			<input type="hidden" name="lxr" value="${houseInfoPostDto.lxr}"/>
			<input type="hidden" name="action" value="publish"/>
			<input type="submit" value="确认提交" class="btn" >&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" value="返回修改" class="btn" onclick="back()">
		</form>
		</td>
	  </tr>
	</table>
	</td>
    <td width="40" background="images/middle4.jpg">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="5"><img src="images/bottom.jpg" width="780" height="82"></td>
  </tr>
</table>
<%@ include file="common/footer.jsp"%>
<br/>
</BODY>
</HTML>