<%--
  Created by IntelliJ IDEA.
  User: YangML
  Date: 2019/3/6
  Time: 下午7:55
  version:TODO
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=basePath%>">
    <script src="static/jquery-3.3.1.min.js"></script>
    <title>Title</title>
    <script >
        function getUrl(){
            $.ajax({
                url:"blog/getBlog/1",
                type:"get",
                dataType:"json",
                success:function(data){
                    console.log(data);
                }
            })
        }
    </script>
</head>
<body>
    <a href="javascript:getUrl()">请求</a>
    <form action="/from" method="post" enctype="multipart/form-data">
        <input type="text" name="name"/>
        <input type="file" name="file"/>
        <input type="submit">
    </form>
</body>
</html>
