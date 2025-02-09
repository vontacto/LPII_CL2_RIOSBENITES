<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Proveedor</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">
Actualizar Provedor
</h1>
<form method="post" action="ControladorProveedor">
<table align="center" border="2">
<!-- recuperamos los valores que vienen del controlador   -->
<%
String idprov=request.getAttribute("idprov").toString();
String nomprov=(request.getAttribute("nomprov")!=null)?request.getAttribute("nomprov").toString():"";
String rucprov=(request.getAttribute("rucprov")!=null)?request.getAttribute("rucprov").toString():"";
String rsocialprov=(request.getAttribute("rsocialprov")!=null)?request.getAttribute("rsocialprov").toString():"";
String emailprov=(request.getAttribute("emailprov")!=null)?request.getAttribute("emailprov").toString():"";
String fechaing=(request.getAttribute("fecha")!=null)?request.getAttribute("fecha").toString():"";
%>
<input  type="hidden" name="idprov"  value="<%=idprov%>">
<tr>
<td>Nombre Proveedor</td>
<td><input type="text" name="nomprov"  value="<%=nomprov%>"></td>
</tr>
<tr>
<td>RUC Proveedor</td>
<td><input type="text" name="rucprov"    value="<%=rucprov%>"></td>
</tr>
<tr>
<td>Razon Social</td>
<td><input type="text" name="rsocialprov"  value="<%=rsocialprov%>"></td>
<tr>
<td>Email</td>
<td><input type="text" name="emailprov"  value="<%=emailprov%>"></td>
</tr>
<td>Fecha Ingreso</td>
<td><input  type="date" name="fechaing" value="<%=fechaing %>"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit"  value="actualizar"></td>
</tr>
</table>
</form>



</body>
</html>