<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
		
		
		<form:form id="personForm" method="POST" modelAttribute="person" commandName="person">
			<table>
					<th>Kişi Ekle</th>
				<tr>
					<td>ID : </td>
					<td>
						<form:input path="id"/>
					</td>
				</tr>
				<tr>
					<td>Ad :</td>
					<td>
						<form:input path="name"/>
					</td>
				</tr>
				<tr>
					<td>Soyad :</td>
					<td>
						<form:input path="surname"/>
					</td>
				</tr>
				<tr>
					<td>
						<button>Kişi Ekle</button>
					</td>
				</tr>
			</table>
		</form:form>

<jsp:include page="personlist.jsp"/>


</body>
</html>