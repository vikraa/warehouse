<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Warehouse</title>
    <link rel="stylesheet" type="text/css" href="/css/table-fixed-header.css" />
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css" />
</head>
<body>

    <table class="table table-fixed-header table-striped table-bordered table-hover table-responsive" width="100%">
        <thead class="header">
        <tr>
            <th valign="middle">Item Id</th>
            <th valign="middle">Name</th>
            <th valign="middle">Quantity</th>
            <th valign="middle">Created Date</th>
            <th valign="middle">Update Date</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="wrhitems" items="${warehouseItems}">
            <tr valign="middle">
                <td valign="middle">${wrhitems.itemId}</td>
                <td valign="middle">${wrhitems.itemName}</td>
                <td valign="middle">${wrhitems.quantity}</td>
                <td valign="middle"><fmt:formatDate value="${wrhitems.createdDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                <td valign="middle"><fmt:formatDate value="${wrhitems.updateDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</body>
</html>