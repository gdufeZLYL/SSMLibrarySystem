<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>修改图书信息</title>

</head>
<body>
<form id="bookForm" action="${pageContext.request.contextPath }/book/editBookSubmit" method="post" >
    <input type="hidden" name="bookId" value="${bookId }"/>
    修改商品信息：
    <table width="100%" border=1>
        <tr>
            <td>图书名称</td>
            <td><input type="text" name="bookName" value="${bookInfo.bookName }"/></td>
        </tr>
        <tr>
            <td>图书描述</td>
            <td><input type="text" name="bookDetail" value="${bookInfo.bookDetail }"/></td>
        </tr>
        <tr>
            <td>出版日期</td>
            <td><input type="text" name="bookTime" value="<fmt:formatDate value="${bookInfo.bookTime}" pattern="yyyy-MM-dd HH-mm-ss"/>"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="提交"/>
            </td>
        </tr>
    </table>

</form>
</body>
</html>