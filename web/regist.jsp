<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/11
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">

        body{
            background-image: url(img/bb.jpg);
            align:"center";
        }
    </style>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
     $(function () {
         $(function () {
             $("#n1").blur(function () {
                 var name=$("#n1").value()
                 var url="${pageContext.request.contextPath}/findUser"
                 var args={"name":name}
                 $.post(url,args,function (data) {
                     if(data.eq("666")){
                         //用户存在
                         $("#s1").innerHTML="用户已存在"
                     }
                     if(data=="empty"){
                         $("#s1").innerHTML="用户不能为空"
                     }
                     if (data.eq("111")){
                         $("#s1").innerHTML="用户名可用";
                     }
                 })
             })
         })

     })
    </script>
</head>
<body>
    <div align="center">
        <form action="addUser" method="post">
            <h2>注册</h2>
            <input type="text" name="name" placeholder="账号" id="n1">
            <span id="s1"></span><br>
            <input type="text" name="password" placeholder="请输入密码" ><br>
            <input type="submit" value="注册">
            <button>返回</button>
        </form>
    </div>
</body>
</html>
