<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Upload File</title>
</head>
<body>
<div>
    <form action="/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="file"><br>
        <input type="submit" value="Upload">
    </form>
</div>
</body>
</html>