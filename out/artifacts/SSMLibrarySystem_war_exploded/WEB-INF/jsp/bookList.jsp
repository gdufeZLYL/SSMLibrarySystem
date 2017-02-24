<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询图书列表</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/book/queryBook" method="post">
    查询条件：
    <table width="100%" border=1>
        <tr>
            <td><input type="submit" value="查询"/></td>
        </tr>
    </table>
    图书列表：
    <table width="100%" border=1>
        <tr>
            <td>图书名称</td>
            <td>图书描述</td>
            <td>出版日期</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${bookList }" var="book">
            <tr>
                <td>${book.bookName }</td>
                <td>${book.bookDetail }</td>
                <td><fmt:formatDate value="${book.bookTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>

                <td><a href="${pageContext.request.contextPath }/book/editBook?bookId=${book.bookId}">修改</a></td>

            </tr>
        </c:forEach>

    </table>
</form>
</body>

</html>