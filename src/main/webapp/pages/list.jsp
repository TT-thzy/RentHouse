<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<HTML>
<HEAD>
	<TITLE>北京出租房</TITLE>
	<%@ include file="/pages/common/header.jsp"%>
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
			<table>
				<tr>
					<td width="3%">&nbsp;</td>
					<td width="97%">



						<table>
							<tr>
								<TD width='250'>标题</TD>
								<TD width='90' align='center'>月租金</TD>
								<TD align='center'>发布日期</TD>
							</tr>
							<tr>
								<td colspan='3'><hr/></td>
							</tr>

							<tr>
								<td><a href='page/detail.htm'>出租健翔桥二居室</a></td>
								<td align='center' style='height:30px;'>2500元</td>
								<td align='center'>2007-08-15</td>
							</tr>


							<tr>
								<td><a href='../page/detail.htm'>健翔桥一居出租了</a></td>
								<td align='center' style='height:30px;'>300元</td>
								<td align='center'>2007-07-03</td>
							</tr>

							<tr>
								<td><a href='../page/detail.htm'>北大附近招合租</a></td>
								<td align='center' style='height:30px;'>1000元</td>
								<td align='center'>2007-07-03</td>
							</tr>

							<tr>
								<td><a href='../page/detail.htm'>出租鼓楼地铁附近/鼓楼西大街/绝好平房!</a></td>
								<td align='center' style='height:30px;'>1500元</td>
								<td align='center'>2007-07-03</td>
							</tr>

							<tr>
								<td><a href='../page/detail.htm'>北三环北太平庄蓟门桥蓟门里小区两居</a></td>
								<td align='center' style='height:30px;'>2200元</td>
								<td align='center'>2007-07-03</td>
							</tr>




							<tr>
								<td><a href='../page/detail.htm'>后现代城一居室出租</a></td>
								<td align='center' style='height:30px;'>2400元</td>
								<td align='center'>2007-07-03</td>
							</tr>

							<tr>
								<td><a href='../page/detail.htm'>北太平庄房屋出租</a></td>
								<td align='center' style='height:30px;'>1000元</td>
								<td align='center'>2007-07-03</td>
							</tr>

							<tr>
								<td><a href='../page/detail.htm'>西便门北二区出租3室1厅</a></td>
								<td align='center' style='height:30px;'>1900元</td>
								<td align='center'>2007-07-03</td>
							</tr>

							<tr>
								<td><a href='../page/detail.htm'>便宜出租前门四合院</a></td>
								<td align='center' style='height:30px;'>2500元</td>
								<td align='center'>2007-07-03</td>
							</tr>

							<tr>
								<td><a href='../page/detail.htm'>出租2居</a></td>
								<td align='center' style='height:30px;'>2100元</td>
								<td align='center'>2007-07-03</td>
							</tr>

							<tr>
								<td><a href='../page/detail.htm'>qq的租房信息1</a></td>
								<td align='center' style='height:30px;'>1000元</td>
								<td align='center'>2007-07-02</td>
							</tr>

							<tr>
								<td colspan='3'><hr/></td>
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
<%@ include file="common/footer.jsp"%>
</BODY>
</HTML>