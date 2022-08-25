<%-- 
    Document   : Login
    Created on : Aug 04, 2018, 11:16:12 PM
    Author     : Tazqia,Niloy,Tanjil,Ismail,Tanveer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page session="false" %> 
<HTML> 
<HEAD> 
<TITLE>Login</TITLE> 
</HEAD> 
<BODY> 
    
    <p> ${message}</p> 
    <%--displaying error message for wrong Username and Password--%>
 
    
<FORM METHOD="POST" action="log"> 
  
<TABLE> 
<TR> 
<TD>User Name</TD> 
<TD><INPUT TYPE=TEXT NAME="userName"></TD> 
</TR> 
<TR> 
<TD>Password</TD> 
<TD><INPUT TYPE=PASSWORD NAME="password"></TD> 
</TR> 
<TR> 
<TD COLSPAN="2"><INPUT TYPE=SUBMIT VALUE="Login"></TD> 
</TR> 
</TABLE> 
</FORM> 
</BODY> 
</HTML>