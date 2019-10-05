<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form method="post" action="newempire">
        Birodalom neve: <input type="text" name="name" > <br>
        <input type="submit" value="ok" >
        
        <c:forEach var="asset" items="${assets}">
            ${asset.name} <input type="text" name="${asset.name}">
        </c:forEach>
            
        <c:forEach var="ppl" items="${people}">
            ${ppl.name} <input type="text" name="${ppl.name}">
        </c:forEach>


            
        
</form>
