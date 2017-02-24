<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>SSE Demo</title>
</head>
<body>
<div id="msgFromPush"></div>
<script type="text/javascript" src="/assets/js/jquery-3.1.1.js"></script>
<script type="text/javascript">
    if (window.EventSource) {
        var source = new EventSource("/sse/push");
        var s = "";
        source.addEventListener("message", function(e) {
            s += e.data + "<br />";
            $("#msgFromPush").html(s);
        });

        source.addEventListener("open", function(e) {
            console.log("连接打开.");
        }, false);

        source.addEventListener("error", function(e) {
            if (e.readyState == EventSource.CLOSED) {
                console.log("连接关闭");
            } else {
                console.log(e.readyState);
            }
        }, false);
    } else {
        console.log("你的浏览器不支持SSE");
    }
</script>
</body>
</html>