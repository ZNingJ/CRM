<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>客户关系管理系统登录</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.min.js"></script>
    <STYLE type=text/css>
        BODY {
            text-align: center;
            padding: 0;
            background-color: #ddeef2;
            margin: 0;
        }

        A:link {
            color: #000000;
            text-decoration: none
        }

        A:visited {
            color: #000000;
            text-decoration: none
        }

        A:hover {
            color: #ff0000;
            text-decoration: underline
        }

        A:active {
            text-decoration: none
        }

        .input {
            border: #ccc 1px solid;
            line-height: 20px;
            width: 182px;
            height: 20px;
        }

    </STYLE>
    <script type="text/javascript">
        function login() {
            var userName = $("#userName").val();
            var password = $("#password").val();
            var roleName = $("#roleName").val();
            if (userName === null || userName === "") {
                alert("用户名不能为空！");
                return;
            }
            if (password === null || password === "") {
                alert("密码不能为空！");
                return;
            }
            if (roleName === null || roleName === "") {
                alert("请选择用户类型！");
                return;
            }
            $("#adminlogin").submit();

        }
    </script>
</head>
<body>
<FORM id=adminlogin method=post
      name=adminlogin action="${pageContext.request.contextPath}/user/login.do">
    <DIV></DIV>
    <TABLE style="MARGIN: auto; WIDTH: 100%; HEIGHT: 100%" border=0
           cellSpacing=0 cellPadding=0>
        <TBODY>
        <TR>
            <TD height=150>&nbsp;</TD>
        </TR>
        <TR style="HEIGHT: 254px">
            <TD>
                <DIV style="MARGIN: 0 auto; WIDTH: 936px"><IMG
                        style="DISPLAY: block" src="${pageContext.request.contextPath}/images/body_03.jpg" alt="no img"></DIV>
                <DIV style="BACKGROUND-COLOR: #278296">
                    <DIV style="MARGIN: 0 auto; WIDTH: 936px">
                        <DIV
                                style="BACKGROUND: url(${pageContext.request.contextPath}/images/body_05.jpg) no-repeat; HEIGHT: 155px">
                            <DIV
                                    style="TEXT-ALIGN: left; WIDTH: 265px; FLOAT: right; HEIGHT: 125px; _height: 95px">
                                <TABLE border=0 cellSpacing=0 cellPadding=0 width="100%">
                                    <TBODY>
                                    <TR>
                                        <TD style="HEIGHT: 45px"><INPUT type="text" class=input value="${user.userName }" name="userName"
                                                                        id="userName"></TD>
                                    </TR>
                                    <TR>
                                        <TD><INPUT type="password" class=input value="${user.password }" name="password" id="password"/>
                                        </TD>
                                    </TR>
                                    <TR>
                                        <td>
                                            <select id="roleName" name="roleName" class="input" style="margin-top: 15px;height: 24px">
                                                <option value="">请选择用户类型...</option>
                                                <option value="系统管理员"  ${'系统管理员'==user.roleName?'selected':'' }>系统管理员</option>
                                                <option value="销售主管"  ${'销售主管'==user.roleName?'selected':'' }>销售主管</option>
                                                <option value="客户经理"  ${'客户经理'==user.roleName?'selected':'' }>客户经理</option>
                                                <option value="高管"  ${'高管'==user.roleName?'selected':'' }>高管</option>
                                            </select>
                                        </td>
                                    </TR>
                                    </TBODY>
                                </TABLE>
                            </DIV>
                            <DIV style="HEIGHT: 1px; CLEAR: both"></DIV>
                            <DIV style="WIDTH: 380px; FLOAT: right; CLEAR: both">
                                <TABLE border=0 cellSpacing=0 cellPadding=0 width=300>
                                    <TBODY>

                                    <TR>
                                        <TD width=100 align=right><INPUT
                                                style="BORDER-WIDTH: 0;"
                                                id=btnLogin src="${pageContext.request.contextPath}/images/btn1.jpg" type=image
                                                name=btnLogin
                                                onclick="login();return false;"></TD>
                                        <TD width=100 align=center><INPUT
                                                style="BORDER-WIDTH: 0;"
                                                id=btnReset src="${pageContext.request.contextPath}/images/btn2.jpg" type=image
                                                name=btnReset
                                                onclick="adminlogin.reset();return false;"></TD>
                                    </TR>
                                    </TBODY>
                                </TABLE>
                            </DIV>
                        </DIV>
                    </DIV>
                </DIV>
                <DIV style="MARGIN: 0 auto; WIDTH: 936px"><IMG
                        src="${pageContext.request.contextPath}/images/body_06.jpg" alt="no img2"></DIV>
            </TD>
        </TR>
        <TR style="HEIGHT: 30%">
            <TD>&nbsp;</TD>
        </TR>
        </TBODY>
    </TABLE>
</FORM>
</body>
</html>
<script type=text/javascript>
    if ('${errorMsg}' !== '') {
        alert('${errorMsg}');
    }
</script>