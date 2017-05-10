<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询页面</title>

</head>
<body>
<div id = "head">
    查询
</div>
<div id = "body">
    <form method="post" action="getall">
    	<div class="botspc">
    		<label for="type">类型</label>
	    	<select id="type" name = "type">
	    		<option value=""></option>
	    		<option value="民谣吉他">民谣吉他</option> 
	    		<option value="电吉他">电吉他</option>
	    		<option value="古典吉他">古典吉他</option>  	
	    	</select>
    	</div>
    	<div class="botspc">
    		<label for="size">尺寸</label>
	    	<select id="size" name = "size">
	    		<option value=""></option>
	    		<option value="41">41</option> 
	    		<option value="40">40</option> 
	    		<option value="39">39</option>  	
	    	</select>
    	</div>
    	<div class="botspc">
    		<label for="color">颜色</label>
	    	<select id="color" name = "color">
	    		<option value=""></option>
	    		<option value="原木">原木</option>
	    		<option value="红色">红色</option>
	    		<option value="黑色">黑色</option>  	
	    	</select>
    	</div>
    	<div class="botspc">
    		<label for="material">表层材质</label>
	    	<select id="material" name = "material">
	    		<option value=""></option>
	    		<option value="椴木">椴木</option> 
	    		<option value="桃花心木">桃花心木</option>  
	    		<option value="云杉木">云杉木</option> 	
	    	</select>
    	</div>
        
        <input class = "btn" type = "submit" value = "查询" />
        <input class = "btn" type = "reset"  balue = "重置" />
    </form>
</div>
</body>
</html>