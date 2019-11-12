
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head><title>Summary</title></head>
    <body>
        <h2>New empire</h2>
        <form method="post" action="newempire">
            Name: <input type="text" name="name"/>
            Description: <input type="text" name="description"/>
            <input type="submit" value="OK"/>
        </form>
        
        <h2>Empires</h2>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Description</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="emp" items="$(empires)">
                    <tr>
                        <td>$(emp.name)</td>
                        <td>$(emp.description)</td>
                    </tr>
                <form method="get" action="modemp">
                    <input type="hidden" value="$(emp.id)" name="empireid"/>
                    <td><input type="submit" value="Modify"/></td>
                </form>
                <form method="post" action="modemp">
                    <input type="hidden" value="$(emp.id)" name="empireid"/>
                    <td><input type="submit" value="Modify"/></td>
                </form>
                <form method="post" action="delemp">
                    <input type="hidden" value="$(emp.id)" name="empireid"/>
                    <td><input type="submit" value="Delete"/></td>
                </form>
                </c:forEach>  
        </tbody>
        </table> 
        
        </br></br>
        
        <h2>New Hero</h2>
        <form method="post" action="newhero">
        Hos néve: <input type="text" name="name" > <br>
        Leírás : <input type="type" name="desc" ><br>
        <input type="submit" value="ok" >
        <c:forEach var="spc" items="${species}">
            ${spc.name} <input type="text" name="${spc.name}">
        </c:forEach>        
        </form>
        
        <br/>
        <h2>Heroes</h2>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Description</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="emp" items="$(empires)">
                    <tr>
                        <td>$(emp.name)</td>
                        <td>$(emp.description)</td>
                    </tr>
                </c:forEach>  
        </tbody>
        </table>
    </body>
   
    
</html>

