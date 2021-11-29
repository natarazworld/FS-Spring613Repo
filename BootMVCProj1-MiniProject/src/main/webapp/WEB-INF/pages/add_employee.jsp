<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm"%>

 <h1 style="color:red;text-align:center">Register Employee </h1>
 
 <frm:form action="register_employee"  method="POST"  modelAttribute="emp">
   <table align="center"  bgcolor="cyan">
     <tr>
        <td>   Employee name::    </td>
        <td> <frm:input path="ename"/> </td>
     </tr>
     <tr>
        <td>   Employee Job/Desg::    </td>
        <td> <frm:input path="job"/> </td>
     </tr>
     <tr>
        <td>   Employee salary::    </td>
        <td> <frm:input path="sal"/> </td>
     </tr>
     <tr>
        <td>  <input type="submit"  value="registerEmployee">   </td>
        <td> <input type="reset"  value="cancel">  </td>
     </tr>
   </table>
 
 </frm:form>