<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/12
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<form name="jobForm" method="post" action="addJob" onSubmit="return jobValidate();" >
    <div class="MainDiv">
        <table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
            <tr>
                <th class="tablestyle_title" >应聘信息录入</th>
            </tr>
            <tr>
                <td class="CPanel">

                    <table border="0" cellpadding="0" cellspacing="0" style="width:80%" align="center">
                        <tr><td align="left">
                            <input type="submit"value="保存" class="button"/>　

                            <input type="reset" value="返回" class="button"/>
                        </td></tr>

                        <TR>
                            <TD width="100%">
                                <fieldset style="height:100%;">
                                    <legend>应聘信息</legend>
                                    <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
                                        <tr>
                                            <td nowrap align="right" width="9%">姓名：</td>
                                            <td width="36%"><input name="name" type="text" class="input">
                                                <span class="red">*</span></td>
                                            <td width="12%"><div align="right">性别：</div></td>
                                            <td width="43%">
                                                <input name="sex" type="radio" value="1" checked>男
                                                <input name="sex" type="radio" value="0">女
                                        </tr>
                                        <tr>
                                            <td nowrap align="right" width="9%">年龄：</td>
                                            <td><input name="age" type="text" class="input"></td>
                                            <td><div align="right">职位：</div></td>
                                            <td><input name="job" type="text" class="input">
                                                <span class="red">*</span></td>
                                        </tr>
                                        <tr>
                                            <td nowrap align="right">所学专业：</td>
                                            <td><input name="specialty" type="text" class="input">
                                                <span class="red">*</span></td>
                                            <td><div align="right">工作经验：</div></td>
                                            <td><input name="experience" type="text" class="input">
                                                <span class="red">*</span></td>
                                        </tr>
                                        <tr>
                                            <td nowrap align="right">学历：</td>
                                            <td><input name="studyeffort" type="text" class="input">
                                                <span class="red">*</span></td>
                                            <td><div align="right">毕业学校：</div></td>
                                            <td><input name="school" type="text" class="input">
                                                <span class="red">*</span></td>
                                        </tr>
                                        <tr>
                                            <td nowrap align="right">电话：</td>
                                            <td><input name="tel" type="text" class="input">
                                                <span class="red">*</span></td>
                                            <td><div align="right">Email：</div></td>
                                            <td><input name="email" type="text" class="input">
                                                <span class="red">*</span></td>
                                        </tr>
                                        <tr>
                                            <td width="9%" nowrap align="right">详细经历：</td>
                                            <td colspan="3">
					<textarea name="content" cols="100" rows="6" class="input" id="content">
					</textarea></td>
                                        </tr>
                                    </table>
                                </fieldset>
                            </TD>

                        </TR>
                    </TABLE>
                </td>
            </tr>
            <TR>
                <TD colspan="2" align="center" height="50px">
                    <input name="提交" type="submit" class="button" value="保存"/>　

                    <input name="重置" type="reset" class="button" value="重置"/></TD>
            </TR>
        </TABLE>
    </div>
<body>

</body>
</html>
