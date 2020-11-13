<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h2>Submitted Student Information</h2>
      <table>
         <tr>
            <td>Name</td>
            <td>${name}</td>
         </tr>
         <tr>
            <td>Address</td>
            <td>${address}</td>
         </tr>
         <tr>
            <td>Student ID</td>
            <td>${studentId}</td>
         </tr>
      </table>  

    </body>
</html>
