<%@ page pageEncoding="UTF-8" language="java" import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<h2>Hello World!</h2>
<body>
	<table width="80%" align="center">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>密码</td>
		</tr>
		<c:forEach items="${list}" var="bean">
			<tr>
				<td>${bean.id}</td>
				<td>${bean.name}</td>
				<td>${bean.pwd}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
