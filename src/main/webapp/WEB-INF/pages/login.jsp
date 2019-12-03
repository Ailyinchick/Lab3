<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <meta charset="utf-8">
</head>
<body>

<form action="showAll">
    <p> All planes: ${showAll} </p>
    <input type="submit" name="Submit" value="Show All">
</form>

<form action="capacity">
    <p> Total capacity: ${capacity} </p>
    <input type="submit" name="Submit" value="Capacity">
</form>

<form action="c_capacity">

    <p> Total carrying capacity: ${c_capacity} </p>
    <input type="submit" name="Submit" value="C_capacity">
</form>

<form action="sorted_plains">

    <p> All planes: ${sorted_plains} </p>
    <input type="submit" name="Submit" value="Sort plains">
</form>

<form action="findPlain" method="post">
    Find plain by fuel consume:
    <p> Plains: ${plains}</p>
    <input type = "text" name = "min" placeholder="min">
    <input type = "text" name = "max" placeholder="max">
    <input type="submit" value="Submit"/>
</form>

</body>
</html>