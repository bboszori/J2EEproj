<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form method="post" action="newhero">
        Hos néve: <input type="text" name="name" > <br>
        Leírás : <input type="type" name="desc" ><br>
        <input type="submit" value="ok" >
        <c:forEach var="spc" items="${species}">
            ${spc.name} <input type="text" name="${spc.name}">
        </c:forEach>        
</form>