<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Personel Contact</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="resources/style.css" />
</head>
<body>
	
	
	<div class="col-lg-3">
	
		<form:form id="personForm" method="POST" action="addPerson" modelAttribute="person" commandName="person"
			cssClass="form-horizontal">

			<table class="table">
			<thead>
				<th>
					
					Kişi 
					  <c:if test="${!empty person.name}">
					 	Güncelle
					  </c:if>
					  <c:if test="${empty person.name}">
					 	Ekle
					  </c:if>
				</th>
			</thead>
				<tr>
					<td>
						<div class="form-group">
							<label class="col-sm-2 control-label">ID</label>
							<div class="col-sm-10">
								<form:input path="id" cssClass="form-control" placeholder="ID giriniz." />
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="form-group">
							<label  class="col-sm-2 control-label">Ad</label>
							<div class="col-sm-10">
								<form:input path="name" cssClass="form-control"  placeholder="Ad giriniz." />
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="form-group">
							<label  class="col-sm-2 control-label">Soyad</label>
							<div class="col-sm-10">
								<form:input path="surname" cssClass="form-control" placeholder="Soyad giriniz." />
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-default pull-right">Kaydet</button>
							</div>
						</div>
					</td>
				</tr>
			</table>

		</form:form>
	</div>
	
	<jsp:include page="persons.jsp"></jsp:include>
	
	<script src="https://code.jquery.com/jquery-2.2.3.min.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script src="resources/jquery.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
		integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
</body>
</html>