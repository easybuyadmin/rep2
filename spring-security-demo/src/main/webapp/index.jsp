<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form action='/login' method='POST'>
    <table>
        <tr>
            <td>用户名:</td>
            <td><input type='text' name='username' value=''></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type='password' name='password' /></td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit"
                                   value="登陆" /></td>
        </tr>
    </table>
</form>
</body>
</html>
