<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<div id="side">
    <h1>Filters:</h1>
    <spring:form modelAttribute="filtersBundle" method="post" action="/eStock/customer/filter">
        <div class="filter">
            <input type="checkbox" value="${filtersBundle.inStockOnly}"/>In stock<br>
        </div>
        <div class="filter">
            <h3>Categories</h3>
            <c:forEach var="filterItem" items="${filtersBundle.categories}">
                <spring:checkbox path="categories" value="${filterItem.checked}" label="${filterItem.name}"/><br>
            </c:forEach>
        </div>
        <div class="filter">
            <h3>Manufacturers</h3>
            <c:forEach var="filterItem" items="${filtersBundle.manufacturers}">
                <spring:checkbox path="manufacturers" value="${filterItem.checked}" label="${filterItem.name}"/><br>
            </c:forEach>
        </div>
        <%--<spring:button>Apply filter</spring:button>--%>
    </spring:form>



</div>
