<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询系统</title>
</head>
<body>
<div id = "head">
    查询系统
</div>
<div id = "body">
    <form method="post" action="getguitar">
    	Builder&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="builder"  /></br>
    	CJ&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="model"  /></br>
    	Type&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="type"  /></br>
    	BackWood<input type="text" name="backWood"  /></br>
    	TopWood&nbsp;&nbsp;<input type="text" name="topWood"  />  </br> 
        <input class = "btn" type = "submit" value = "提交" />
        <input class = "btn" type = "reset"  balue = "重置" />
    </form>
</div>
</body>
</html>