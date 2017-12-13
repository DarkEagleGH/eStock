<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="content">
    <h1>eStock customer page</h1>
    <c:forEach var="item" items="${itemsList}">
        <div class="item">
            <div class="stockState">
                Price:
                <div class="price">${item.price}</div>
                <br>
                Available in stock: ${item.availableinStock}
            </div>
            <h3>${item.name}</h3>
            [${item.category}] ${item.manufacturer} - ${item.model}. Description: ${item.description}. (${item.quantity})
        </div>
    </c:forEach>
</div>