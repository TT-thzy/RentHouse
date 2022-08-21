<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<HTML>
<HEAD>
	<%@ include file="/pages/common/header.jsp"%>
<script   language="javascript">   
	function back(){
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

</script>

	<table align="center">
		<%@ include file="common/currentUser.jsp"%>
		<%@ include file="common/Menu.jsp"%>
	</table>
</td>
    <td width="35" background="images/layout_24.gif">&nbsp;</td>
    <td width="495" align="center">

	<table width="450">
	  <tr>
		<td id=listTitle>${requestScope.houseInfoDetail.title}</td>
	  </tr>
	  <tr>
	    <td id=listTitle><hr/></td>
	    </tr>
	  <tr>
		<td><strong>电话/手机：</strong>${requestScope.houseInfoDetail.telephone}</td>
	  </tr>
	  <tr>
		<td><strong>联系人：</strong>${requestScope.houseInfoDetail.lxr}</td>
	  </tr>
	  <tr>
		<td><strong>房屋类型：</strong>${requestScope.houseInfoDetail.fwlx}</td>
	  </tr>
	  <tr>
		<td><strong>户型：</strong>${requestScope.houseInfoDetail.hx}</td>
	  </tr>
	  <tr>
		<td><strong>价格：</strong>${requestScope.houseInfoDetail.zj}元</td>
	  </tr>
	  <tr>
		<td><strong>地段：</strong>${requestScope.houseInfoDetail.qx}--区县&nbsp;&nbsp;${requestScope.houseInfoDetail.jd}--街道</td>
	  </tr>
	  <tr>
		<td><strong>发布时间：</strong> ${requestScope.houseInfoDetail.date}</td>
	  </tr>
	  <tr>
		<td><hr></td>
	  </tr>
	  <tr>
		<td > ${requestScope.houseInfoDetail.fwxx}</td>
	  </tr>
	  <tr>
		<td><input type="button" value="后退" class="btn" onclick="back()"></td>
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
</BODY>
</HTML>