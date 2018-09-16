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
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css" />
</head>
<body>

<form class="form-horizontal" role="form" method="post" action="#">
    <div class="form-group">
        <label class="col-sm-2 control-label">Item Name</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="itemName" name="itemName" value="">
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">Quantity</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="quantity" name="quantity" value="1">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <input type="submit" class="btn btn-default" id="btnSubmit" value="Submit" />
            <a href="${'/warehouse'}" id="back" class="btn btn-default"><i class="glyphicon"></i>Cancel</a>
        </div>
    </div>
</form>

</body>