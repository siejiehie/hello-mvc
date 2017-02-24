<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Servlet Async Support</title>
</head>
<body>
<script type="text/javascript" src="/assets/js/jquery-3.1.1.js"></script>
<script type="text/javascript">
    deferred();

    function deferred() {
        $.get("deffer", function(data) {
            console.log(data);
            deferred();
        });
    }
</script>
</body>
</html>