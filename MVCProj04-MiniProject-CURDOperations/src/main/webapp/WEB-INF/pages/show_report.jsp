<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<c:choose>
    <c:when test="${!empty empsInfo}">
        <h1 style="color:red;text-align:center">Employee Report </h1>
         <table border="1"  align='center'  bgcolor="cyan">
              <tr> 
                 <th> EMPNO </th> <th> ENAME </th> <th> JOB </th> <th>SALARY </th>  <th> Operations  </th>
               </tr>
               <c:forEach var="emp" items="${empsInfo}">
                 <tr>
                   <td>${emp.empno} </td>
                   <td>${emp.ename} </td>
                   <td>${emp.job} </td>
                   <td>${emp.sal} </td>
                   <td>     
                       <a href="edit?no=${emp.empno}"><img src="resources/images/edit.png" width="30" height="30"></a>
                        <a href="delete?no=${emp.empno}"><img src="resources/images/delete.jpg" width="30" height="30"></a>
                   </td>
                 </tr>
               </c:forEach>
         </table>
    </c:when>
    <c:otherwise>
        <h1 style="color:red;text-align:center">Records  not found </h1>
    </c:otherwise>
</c:choose>
 <br><br>
              <h1 style="color:blue;text-align:center"> ${resultMsg} </h1>
  <br><br>
    <h1 style="text-align:center"><a href="register_employee">Register Employee </a></h1>
    
    