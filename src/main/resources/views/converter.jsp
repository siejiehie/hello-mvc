<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Converter</title>
</head>
<body>
<input id="req" type="button" value="Request">
<div id="resp"></div>
<script src="/assets/js/jquery-3.1.1.js"></script>
<script>
    $("#req").on("click", request);
    function request() {
        $.ajax({
            url: "/convert",
            type: "POST",
            contentType: "application/x-widely",
            data: "1234-Toya Sona",
            success: function(data) {
                $("#resp").html(data);
            }
        });
    }
</script>
</body>
</html>