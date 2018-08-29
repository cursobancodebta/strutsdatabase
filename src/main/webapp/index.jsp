<%-- 
    Document   : index.jsp
    Created on : Aug 25, 2018, 6:16:41 AM
    Author     : jpramirez
--%>

<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
         <s:head />
    </head>
    <body>

<s:form action="login">  
<s:textfield name="userDto.login" label="Login"></s:textfield>  
<s:password name="userDto.password" label="Password"></s:password>  
<s:submit value="login"></s:submit>  
</s:form>         
        
    </body>
</html>

