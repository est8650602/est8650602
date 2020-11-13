<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
      <h2>Student Information</h2>
      <form:form method = "post" action = "" onclick="return false">
         <table>
            <tr>
               <td><form:label path = "name">Name</form:label></td>
               <td><form:input path = "name" id="name"/></td>
            </tr>
            <tr>
               <td><form:label path = "address">Address</form:label></td>
               <td><form:input path = "address"  id="address"/></td>
            </tr>
            <tr>
               <td><form:label path = "studentId">Student ID</form:label></td>
               <td><form:input path = "studentId"  id="studentId"/></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit" onclick="send()" />
               </td>
            </tr>
         </table>  
      </form:form>
      <div id="div1"></div>
      <script>
          function send(){
              $.post("addStudent",{"address":$("#address").val() , "name":$("#name").val(),"studentId":$("#studentId").val()},function(data){
                   $("#div1").html(data); 
              });
          }
      </script>
   </body>
   
</html>

