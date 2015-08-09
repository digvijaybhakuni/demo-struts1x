<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Struts Login With Internationalization and Localization Demo  | DGStack.com</title>
</head>
<body>
	<img alt="DGStack.com" height="86px" src="img/DGStackLogo.png">
	<img alt="Struts" src="img/struts.gif">
	<h3><bean:message key="dgstack.header.login"/></h3>
	<html:form action="/login" method="post" focus="username">
	<table>
		<tr>
			<td colspan="2" style="color:red;">
				<html:errors />
				<logic:equal value="true" name="loginError">
					<bean:message key="dgstack.error.login.fail"/>
				</logic:equal>
			</td>
		</tr>
		<tr>
			<td><bean:message key="dgstack.label.login.username"/></td>
			<td><html:text property="username"></html:text></td>
		</tr>
		<tr>
			<td><bean:message key="dgstack.label.login.password"/></td>
			<td><html:password property="password"></html:password></td>
		</tr>
		<tr>
			<td><html:submit><bean:message key="dgstack.label.login.submit"/></html:submit></td>
			<td><html:reset><bean:message key="dgstack.label.login.reset"/></html:reset></td>
		</tr>
	</table>
	<div>
		<h5><bean:message key="dgstack.label.global.change.language"/></h5>
		<a href='changeLang.do?to=en'>English</a> | 
		<a href='changeLang.do?to=hi'>&#2361;&#2367;&#2306;&#2342;&#2368;</a> | 
		<a href='changeLang.do?to=de'>Deutsche</a> |
		<a href='changeLang.do?to=fr'>Français</a> | 
		<a href='changeLang.do?to=es'>Español</a>  
	</div>
	</html:form>
</body>
</html>
