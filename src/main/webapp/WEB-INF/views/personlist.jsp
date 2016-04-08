<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table border=1px>
	<tr class=tags>
		<th>ID</th>
		<th>Kullanıcı Adı</th>
		<th>Yetki</th>
		<th>Sil</th>
		<th>Güncelle</th>
	</tr>

	<c:forEach items="${persons}" var="person" varStatus="i">
		<c:choose>
			<c:when test="${i.count % 2 == 0 }">
				<c:out value="<tr class=black>" escapeXml="false"></c:out>
			</c:when>
			<c:otherwise>
				<c:out value="<tr class=white>" escapeXml="false"></c:out>
			</c:otherwise>
		</c:choose>
		<td>${person.id}</td>
		<td><c:out value="${person.name}"></c:out></td>
		</tr>
	</c:forEach>

</table>