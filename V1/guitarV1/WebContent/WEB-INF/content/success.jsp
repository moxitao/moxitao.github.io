<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>查询页面</title>
<style>
*{
    margin:0;
    padding:0;
}
#head{
    text-align: left;
    height: 50px;
    font-size: 25px;
    line-height: 50px;
    padding-left: 50px;
}
table{
    margin:0 auto;
    text-align: center;
}
table tr td,th{
    border:1px solid yellow;
}
th,th{
	width:80px;
}
</style>
</head>
<body>
<div id = "head">
    查询
</div>
<div id = "bod">
    <table align="center" valign="middle" cellspacing="0" cellpadding="0">
        <thead>
            <tr>               
                <th>名字</th>
                <th>类型</th>
                <th>价格</th>
                <th>尺寸</th>
                <th>颜色</th>
                <th>材质</th>
                <th>产地</th>
                <th>描述</th>
            </tr>
        </thead>
        <tbody>
        	<s:iterator value='#session.guitarlist' id="guitarlist">
	            <tr>
	                <td><s:property value="#guitarlist.name"/></td>
	                <td><s:property value="#guitarlist.type"/></td>
	                <td><s:property value="#guitarlist.price"/></td>
	                <td><s:property value="#guitarlist.size"/></td>
	                <td><s:property value="#guitarlist.color"/></td>
	                <td><s:property value="#guitarlist.material"/></td>
	                <td><s:property value="#guitarlist.location"/></td>
	                <td><s:property value="#guitarlist.descriprition"/></td>
	            </tr>
            </s:iterator>
        </tbody>
    </table>
</div>
</body>
</html>