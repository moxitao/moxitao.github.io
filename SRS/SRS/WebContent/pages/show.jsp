{\rtf1\ansi\ansicpg936\deff0\nouicompat\deflang1033\deflangfe2052{\fonttbl{\f0\fnil\fcharset134 \'cb\'ce\'cc\'e5;}}
{\*\generator Riched20 10.0.14393}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\f0\fs22\lang2052 <%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>\par
\par
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\par
\par
<%\par
\par
String path = request.getContextPath();\par
\par
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";\par
\par
%>\par
\par
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">\par
\par
<html>\par
\par
  <head>\par
\par
    <base href="<%=basePath%>">\par
\par
    <title>\'b7\'d6\'d2\'b3\'bc\'bc\'ca\'f5</title>\par
\par
  </head>\par
\par
  \par
\par
  \par
\par
  <body>\par
\par
  <table border="1"  width="50%">\par
\par
  <tr>\par
\par
  <th>ID</th>\par
\par
  <th>\'d0\'d5\'c3\'fb</th>\par
\par
  <th>\'c4\'ea\'c1\'e4</th>\par
\par
  </tr>\par
\par
 \par
\par
  <c:forEach items="$\{pageObject.list \}" var="student" >                  <!---->\par
\par
  \tab\tab <tr>\par
\par
  \tab\tab\tab <td>$\{student.id \}</td>\par
\par
  \tab\tab\tab <td>$\{student.name \}</td>\par
\par
  \tab\tab\tab <td>$\{student.sex \}</td>\par
\par
  \tab\tab <td><a href="student?action=delete&sid=$\{student.id\}">\'c9\'be\'b3\'fd</a></td>  <!--=path-->\par
\par
        <td><a href="student?action=findedit&sid=$\{student.id\}">\'d0\'de\'b8\'c4</a></td>\tab  \par
\par
  \tab\tab </tr>\par
\par
  </c:forEach>\par
\par
  \par
\par
  </table>\par
\par
  $\{ pageObject.pageModel\}\par
\par
  <a href="student?action=findadd">\'cc\'ed\'bc\'d3\'d1\'a7\'c9\'fa</a>\par
\par
  </body>\par
\par
</html>\par
}
 