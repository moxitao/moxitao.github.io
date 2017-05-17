<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>查询结果</title>

</head>
<body>
<div id = "head">
    查询结果
</div>
<div id = "bod">
    <table align="center" valign="middle" cellspacing="0" cellpadding="0">
        <thead>
            <tr>
                <th>序号</th>
               	<th>价格</th>
               	<th>生产商</th>
               	<th>模型</th>
               	<th>吉他类型</th>
               	<th>库存</th>
               	<th>背板材质</th>
               	<th>面板材质</th>
            </tr>
        </thead>
        <tbody>
        	<s:iterator value='#session.guitarlist' id="list">
	            <tr>
	            	<td><s:property value="#list.serialNumber"/></td>  
	                <td><s:property value="#list.price"/></td>
	                <td><s:property value="#list.spec.builder"/></td>  
	                <td><s:property value="#list.spec.model"/></td>  
	                <td><s:property value="#list.spec.type"/></td>  
	                <td><s:property value="#list.spec.numStrings"/></td>  
	                <td><s:property value="#list.spec.backWood"/></td>  
	                <td><s:property value="#list.spec.topWood"/></td>              
	            </tr>
            </s:iterator>
        </tbody>
    </table>
</div>
</body>
</html>