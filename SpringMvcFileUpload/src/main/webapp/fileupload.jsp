<%@ page pageEncoding="UTF-8" language="java"%>
<html>
<body>
    <form action="upload" enctype="multipart/form-data" method="post">
        <table>
            <tr>
                <td>请选择文件：</td>
                <td><input type="file" name="file"></td> <!-- 这里的file与FileUploadController请求参数的名字一直 -->
            </tr>
            <tr>
                <td>开始上传：</td>
                <td><input type="submit" value="上传"></td>
            </tr>
        </table>
    </form>
</body>
</html>
