<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<HTML>
<HEAD>
    <TITLE>北京出租房</TITLE>
    <%@ include file="/pages/common/header.jsp" %>

    <script language="javascript">
        <!--
        <!--   取得javascript数组信息  -->
        var v = new Array(19);
        var n = new Array(19);
        v[0] = new Array('0');
        n[0] = new Array('不限--');
        v[1] = new Array('1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24', '25', '26', '27', '28', '29', '30', '31', '32', '33', '34', '35', '36', '37', '38');
        n[1] = new Array('中关村', '北京大学', '清华大学', '上地', '白颐路', '西三环', '学院路', '西直门外', '紫竹院', '八里庄', '公主坟', '五道口', '双榆树', '西三旗', '清河', '马连洼', '青龙桥', '香山', '田村路', '永定路', '万寿路', '羊坊店', '甘家口', '北航', '北下关', '北太平庄', '万柳', '东升', '四季青', '西北旺', '温泉镇', '苏家坨', '上庄', '魏公村', '航天桥', '花园路', '动物园', '其他');
        v[2] = new Array('39', '40', '41', '42', '43', '44', '45', '46', '47', '48', '49', '50', '51', '52', '53', '54', '55', '56', '57', '58', '59', '60', '61', '62', '63', '64', '65', '66', '67', '68', '69', '70', '71', '72', '73', '74', '75', '76', '77', '78', '79', '80', '81', '82', '83', '84', '85', '86', '87', '88', '89', '90', '91');
        n[2] = new Array('亚运村', '三元桥', '建外大街', '国展', '三里屯', '劲松', '燕莎', '团结湖', '京广桥', '望京', '安贞桥', '潘家园', '酒仙桥', '呼家楼', '双井', '垡头', '六里屯', '麦子店', '左家庄', '香河园', '首都机场', '小关', '和平街', '小红门', '十八里店', '豆各庄', '黑庄户', '王四营', '南磨房', '三间房', '管庄', '高碑店', '常营', '平房', '东风', '东坝', '金盏', '将台', '崔各庄', '孙河', '来广营', '太阳宫', '大屯', '奥运村', '国贸', '西坝河', '朝外大街', '红庙', '八里庄', '花家地', '安华桥', '将台路', '其他');
        v[3] = new Array('92', '93', '94', '95', '96', '97', '98', '99');
        n[3] = new Array('前门', '天坛', '崇文门外', '龙潭湖', '东花市', '体育馆路', '永定门外', '其他');
        v[4] = new Array('100', '101', '102', '103', '104', '105', '106', '107', '108', '109', '110', '111', '112', '113', '114', '115', '116');
        n[4] = new Array('白广路', '大观园', '菜市口', '虎坊桥', '长椿街', '和平门', '天桥', '宣武门', '大栅栏', '珠市口', '牛街', '白纸坊', '陶然亭', '椿树街道', '广安门内', '广安门外', '其他');
        v[5] = new Array('117', '118', '119', '120', '121', '122', '123', '124', '125', '126', '127', '128', '129', '130', '131', '132', '133', '134');
        n[5] = new Array('东直门', '北新桥', '交道口', '景山', '东四十条', '工体', '朝阳门', '建国门', '北京站', '和平里', '雍和宫', '东直门外', '王府井', '东单', '东四', '东华门', '安定门', '其他');
        v[6] = new Array('135', '136', '137', '138', '139', '140', '141', '142', '143', '144', '145', '146', '147', '148', '149', '150', '151', '152');
        n[6] = new Array('白云路', '西便门', '南礼士路', '月坛', '阜成门', '展览路', '西单', '西四', '西直门', '新街口', '什刹海', '地安门', '鼓楼', '德外', '金融街', '西长安街', '德胜门', '其他');
        v[7] = new Array('153', '154', '155', '156', '157', '158', '159', '160', '161', '162', '163', '164', '165', '166', '167');
        n[7] = new Array('北苑', '中仓', '新华', '玉桥', '永顺', '梨园', '宋庄', '潞城', '张家湾', '台湖', '马驹桥', '西集', '漷县', '永乐店', '其他');
        v[8] = new Array('168', '169', '170', '171', '172', '173', '174', '175', '176', '177', '178', '179', '180', '181', '182', '183');
        n[8] = new Array('玉泉营', '方庄', '丰台路', '卢沟桥', '太平桥', '长辛店', '云岗', '新村', '右安门', '马家堡', '西罗园', '大红门', '南苑', '东高地', '东铁匠营', '其他');
        v[9] = new Array('184', '185', '186', '187', '188', '189', '190', '191', '192', '193', '194', '195', '196', '197', '198', '199', '200', '201', '202');
        n[9] = new Array('城北', '城南', '南口', '马池口', '沙河', '回龙观', '天通苑', '流村', '阳坊', '十三陵', '长陵', '南邵', '崔村', '兴寿', '小汤山', '百善', '东小口', '北七家', '其他');
        v[10] = new Array('203', '204', '205', '206', '207', '208', '209', '210', '211', '212', '213', '214', '215', '216', '217', '218', '219', '220');
        n[10] = new Array('兴丰', '清源', '林校路', '黄村', '西红门', '旧宫', '亦庄', '瀛海', '青云店', '长子营', '采育', '安定', '魏善庄', '礼贤', '榆垡', '庞各庄', '北臧村', '其他');
        v[11] = new Array('221', '222', '223', '224', '225', '226', '227', '228', '229', '230', '231', '232', '233', '234', '235');
        n[11] = new Array('大峪', '城子街道', '东辛房', '大台', '王平', '龙泉', '永定', '潭柘寺', '王平', '军庄', '妙峰山', '雁翅', '斋堂', '清水', '其他');
        v[12] = new Array('236', '237', '238', '239', '240', '241', '242', '243', '244', '245');
        n[12] = new Array('八宝山', '古城', '苹果园', '鲁谷', '老山', '八角', '金顶街', '广宁', '五里坨', '其他');
        v[13] = new Array('246', '247', '248', '249', '250', '251', '252', '253', '254', '255', '256', '257', '258', '259', '260', '261', '262', '263', '264', '265', '266', '267', '268', '269', '270', '271', '272');
        n[13] = new Array('城关', '东风', '向阳', '迎风', '新镇', '星城', '良乡', '琉璃河', '周口店', '长阳', '阎村', '窦店', '韩村河', '石楼', '长沟', '大石窝', '张坊', '十渡', '青龙湖', '河北镇', '佛子庄', '大安山', '史家营', '南窖', '霞云岭', '蒲洼', '其他');
        v[14] = new Array('273', '274', '275', '276', '277', '278', '279', '280', '281', '282', '283', '284', '285', '286', '287', '288', '289', '290', '291', '292', '293', '294', '295');
        n[14] = new Array('胜利', '光明', '石园', '仁和', '马坡', '牛栏山', '杨镇', '南法信', '后沙峪', '天竺', '北小营', '南彩', '木林', '龙湾屯', '张镇', '大孙各庄', '北务', '李遂', '李桥', '高丽营', '赵全营', '北石槽', '其他');
        v[15] = new Array('296', '297', '298', '299', '300', '301', '302', '303', '304', '305', '306', '307', '308', '309', '310', '311', '312');
        n[15] = new Array('溪翁庄', '十里堡', '河南寨', '东邵渠', '巨各庄', '大城子', '北庄', '太师屯', '新城子', '古北口', '高岭', '不老屯', '冯家峪', '石城', '西田各庄', '穆家峪', '其他');
        v[16] = new Array('313', '314', '315', '316', '317', '318', '319', '320', '321', '322', '323', '324', '325', '326');
        n[16] = new Array('龙山', '泉河', '庙城', '雁栖', '杨宋', '北房', '怀北', '渤海镇', '九渡河', '桥梓', '琉璃庙', '汤河口', '宝山', '其他');
        v[17] = new Array('327', '328', '329', '330', '331', '332', '333', '334', '335', '336', '337', '338', '339', '340', '341', '342');
        n[17] = new Array('延庆', '康庄', '八达岭', '大榆树', '井庄', '永宁', '四海', '千家店', '旧县', '沈家营', '张山营', '大庄科', '香营', '刘斌堡', '珍珠泉', '其他');
        v[18] = new Array('343', '344', '345', '346', '347', '348', '349', '350', '351', '352', '353', '354', '355', '356', '357', '358', '359', '360', '361', '362');
        n[18] = new Array('滨河', '兴谷', '渔阳', '峪口', '马坊', '金海湖', '平谷镇', '大兴庄', '马昌营', '东高村', '夏各庄', '南独乐河', '镇罗营', '大华山', '刘家店', '王辛庄', '山东庄', '黄松峪', '熊儿寨', '其他');


        function selectjd() {
            var row = document.mf.qxid.value;//alert(row);
            var col = v[row].length;//alert(col);
            document.mf.jdid.length = 0;
            document.mf.jdid.options[0] = new Option('不限--', '0');
            for (var i = 0; i < col; i++) {
                if (v[row][i] != 0) {
                    document.mf.jdid.options[i + 1] = new Option(n[row][i], v[row][i]);
                }
            }
        }

        $(function () {
            $("#qx").change(function () {
                //清空数据
                $("#jd").empty();
                var qxid = $(this).val();
                // alert(qxid);
                // $.getJSON("http://localhost:8080/rent/streetServlet","action=getStreetByQx&qxid=" + qxid, function (data) {
                //
                // });
                $.ajax({
                    url: "http://localhost:8080/rent/streetServlet?action=getStreetByQx&qxid=" + qxid,
                    async: false,
                    success: function (data) {
                        streets = JSON.parse(data);
                        // console.log(streets);
                        for (x in streets) {
                            document.mf.jdid.options[x] = new Option(streets[x].jd, streets[x].jdid);
                        }
                    },
                });

            })
        })
        -->
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
        <td width="172" valign="top" align="center">

            <script language="javascript">
                <!--
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

                -->
            </script>

            <table align="center">
                <%@ include file="common/currentUser.jsp" %>
                <tr>
                    <td width='150'><a href="userServlet?action=queryHouseInfoById&uid=${sessionScope.user.uid}">管理我的租房信息</a>
                    </td>
                </tr>
                <tr>
                    <td width='100'><a href="houseInfoServlet?action=initData">发布租房信息</a></td>
                </tr>
                <tr>
                    <td width='100'><a href="userServlet?action=logout">[注销]</a></td>
                </tr>
            </table>
            <style>td {
                border: solid 0px blue;
            }

            .table_title {
                border: solid 1px #aaa;
                border-width: 0 0 1px 0;
            }
            </style>
        </td>

        <td width="35" background="images/layout_24.gif">&nbsp;</td>
        <td width="495" align="center"><br/>
            <form action="houseInfoServlet" method="post" name="mf">
                <input type="hidden" name="action" value="MultiConditionQuery"/>
                <script>
                    function fswitch(id) {
                        var o = document.getElementById(id);
                        if (o) {
                            if (o.style.display == "none") {
                                o.style.display = "block";
                            } else {
                                o.style.display = "none";
                            }
                        }
                    }
                </script>
                <div style="text-align:left;width:88%;">
                    <input name="title">
                    <input type="submit" value="查询" class="btn"> <span onclick="fswitch('advSearch');"
                                                                       style="cursor:hand;color:blue;">高级搜索</span>
                </div>

                <table width="88%;" id="advSearch" style="border:solid 0px #000;display:none;">

                    <tr>
                        <td>区县：</td>
                        <td>
                            <select name="qxid" id="qx" style="width: 80px">
                                <c:forEach items="${requestScope.districtsList}" var="districts">
                                    <option value="${districts.qxid}">${districts.qx}</option>
                                </c:forEach>
                            </select>
                        </td>
                        <td rowspan="6">&nbsp;</td>
                    </tr>
                    <tr>
                        <td>街道：</td>
                        <td><select name="jdid" style="width: 80px" id="jd">
                            <option value="0">不限--</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td>租金：</td>
                        <td><input type="text" name="zjBegin" size="5" class="unnamed1">
                            至
                            <input type="text" name="zjEnd" size="5" class="unnamed1">
                            元/月
                        </td>
                    </tr>
                    <tr>
                        <td>户型：</td>
                        <td><select name="shi" style="width: 60px">
                            <option value="0">不限--</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                        </select>室
                            <select name="ting" style="width: 60px">
                            <option value="0">不限--</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                        </select> 厅
                        </td>
                    </tr>
                    <tr>
                        <td>房屋类型：</td>
                        <td>
                            <input type="checkbox" name="fwlx" value="1">地下室
                            <input type="checkbox" name="fwlx" value="2">平房
                            <input type="checkbox" name="fwlx" value="3">普通住宅
                            <input type="checkbox" name="fwlx" value="4">公寓
                            <input type="checkbox" name="fwlx" value="5">别墅
                        </td>
                    </tr>
                    <tr>
                        <td>发布日期：</td>
                        <td><select name="date" style="width: 80px">
                            <option value="0">不限--</option>
                            <option value="1">当天</option>
                            <option value="2">近两天</option>
                            <option value="3">近三天</option>
                            <option value="7">近一周</option>
                            <option value="14">近两周</option>
                            <option value="30">近一月</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td colspan='3'>
                            <hr/>
                        </td>
                    </tr>

                </table>
                <table width="88%" cellspacing="0">
                    <tr>
                        <TD width='250' class="table_title">标题</TD>
                        <TD width='90' align='center' class="table_title">月租金</TD>
                        <TD align='center' class="table_title">发布日期</TD>
                    </tr>

                    <c:forEach items="${requestScope.HouseInfos}" var="house">
                        <tr>
                            <td><a href='houseInfoServlet?action=getHouseDetail&fwid=${house.fwid}'>${house.title}</a>
                            </td>
                            <td align='center' style='height:30px;'>${house.zj}元</td>
                            <td align='center'>${house.date}</td>
                        </tr>
                    </c:forEach>

                    <tr>
                        <td colspan='3'>
                            <hr/>
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