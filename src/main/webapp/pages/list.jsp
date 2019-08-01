<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>BookList</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>书籍编号</td>
            <td>书籍名称</td>
            <td>价格</td>
            <td>时间</td>
        </tr>
        <s:iterator value="#bookList" status="bs">
            <tr>
                <td><s:property value="BookId" /></td>
                <td><s:property value="BookName" /></td>
                <td><s:property value="%{formatDouble(Price)}" /></td>
                <td><s:date name="UpdateTime" format="yyyy-MM-dd" /></td>
            </tr>
        </s:iterator>
        <s:if test="#bookList.size() == 0">
            <tr>
                <td colspan="4">没有查找到数据</td>
            </tr>
        </s:if>
    </table>
</body>
</html>
