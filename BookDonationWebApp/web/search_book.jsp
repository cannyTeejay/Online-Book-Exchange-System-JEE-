<%-- 
    Document   : search_book
    Created on : 11 May 2025, 12:55:45 PM
    Author     : selal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Book Page</title>
    </head>
    <body>
        <h1>Search Books</h1>
        <form action="SearchBookServlet.do" method="Post">
            <table>
                <tr>
                    <td>Book Name:</td>
                    <td><input type="text" name="bookName"></td>
                </tr>
                <tr>
                    <td>Search Book By:</td>
                    <td>
                        <select name="search">
                            <option value="title">Title</option>
                            <option value="faculty">Faculty</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="SEARCH"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
