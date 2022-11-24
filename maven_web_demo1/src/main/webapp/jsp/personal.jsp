<%--
  Created by IntelliJ IDEA.
  User: 18517
  Date: 2022/9/29
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
    <!--引入BootStrap样式文件-->
    <link rel="stylesheet" href="<%= session.getAttribute("rootPath") %>/bs/css/bootstrap.min.css">
    <!--引入BootStrap主文件-->
    <script src="<%= session.getAttribute("rootPath") %>/bs/js/bootstrap.min.js"></script>
    <!--引入BootStrap依赖文件-->
    <script src="<%= session.getAttribute("rootPath") %>/bs/jquery/jquery-3.4.1.min.js"></script>
</head>
<body>
<% Object o = request.getAttribute("now_userName");
    System.out.println("o是：" + o);
%>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form action="http://localhost:8080/maven_web_demo1_war_exploded/doPersonal" method="post">
                <div class="form-group">
                    <label for="now_userName">当前用户名</label><input type="text" class="form-control" id="now_userName" name="now_userName" value="<%= request.getAttribute("now_userName") %>" readonly="readonly"/>
                </div>
                <div class="form-group">
                    <label for="userName">新用户名</label><input type="text" class="form-control" id="userName" name="userName"/>
                </div>
                <div class="form-group">
                    <label for="password">新密码</label><input type="text" class="form-control" id="password" name="password"/>
                </div>
                <div class="form-group">
                    <label for="name">姓名</label><input type="text" class="form-control" id="name" name="name"/>
                </div>
                <div class="form-group">
                    <label for="sno">学号</label><input type="text" class="form-control" id="sno" name="sno"/>
                </div>
                <div class="form-group">
                    <label for="gender">性别</label><input type="text" class="form-control" id="gender" name="gender"/>
                </div>
                <div class="form-group">
                    <label for="class">班级</label><input type="text" class="form-control" id="class" name="class"/>
                </div>
                <div class="form-group">
                    <label for="IDnumber">身份证</label><input type="text" class="form-control" id="IDnumber" name="IDnumber"/>
                </div>
                <div class="form-group">
                    <label for="age">年龄</label><input type="text" class="form-control" id="age" name="age"/>
                </div>
                <div class="form-group">
                    <label for="addr">住址</label><input type="text" class="form-control" id="addr" name="addr"/>
                </div>
                <div class="form-group">
                    <label for="mor_up">早起时间</label><input type="text" class="form-control" id="mor_up" name="mor_up"/>
                </div>
                <div class="form-group">
                    <label for="eve_sleep">睡觉时间</label><input type="text" class="form-control" id="eve_sleep" name="eve_sleep"/>
                </div>
                <div class="form-group">
                    <label for="bestfood">最喜欢的食物</label><input type="text" class="form-control" id="bestfood" name="bestfood"/>
                </div>
                <div class="form-group">
                    <label for="fav_place">最喜欢的地方</label><input type="text" class="form-control" id="fav_place" name="fav_place"/>
                </div>
                <div class="form-group">
                    <label for="fav_idol">最喜欢的偶像</label><input type="text" class="form-control" id="fav_idol" name="fav_idol"/>
                </div>
                <div class="form-group">
                    <label for="fav_book">最喜欢的书</label><input type="text" class="form-control" id="fav_book" name="fav_book"/>
                </div>
                <div class="form-group">
                    <label for="hobby">兴趣爱好</label><input type="text" class="form-control" id="hobby" name="hobby"/>
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
