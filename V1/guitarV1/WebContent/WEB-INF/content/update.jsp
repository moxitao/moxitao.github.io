<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>添加</title>
</head>
<body>

<s:iterator value='#session.guitarlist' id="guitarlist">
<span><s:property value="#guitarlist.name"/></span>
<span><s:property value="#guitarlist.price"/></span>
<a href="delete?username=<s:property value="#userlist.username"/>">删除</a>
<a href="updateinfo?username=<s:property value="#userlist.username"/>&password=<s:property value="#userlist.password"/>">更新</a>
<br/>
</s:iterator>

</body>
</html>