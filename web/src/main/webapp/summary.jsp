
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form method="post" action="newhero">
        Hosok:<br>
        <input type="submit" value="Uj hos letrehozasa" name ="button"><br>
        <c:forEach var="hero" items="${heroes}">
            ${hero.name} <br>
        </c:forEach>      
                
</form>

<form method="post" action="newempire">
        Birodalmak:<br>
        <input type="submit" value="Uj birodalom letrehozasa" name ="button"><br>
        <c:forEach var="emp" items="${empires}">
            ${emp.name} <br>
        </c:forEach>
</form>

