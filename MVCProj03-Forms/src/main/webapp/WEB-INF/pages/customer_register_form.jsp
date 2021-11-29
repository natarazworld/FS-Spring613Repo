
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm"%>

<h1 style="color:blue;text-align: center">Fill the custmer details</h1>

<frm:form method="POST" action="customer_register" modelAttribute="cust">
   <table boder="0" align="center" bgcolor="cyan">
       <tr>
         <td>  customer number :: </td>
         <td>  <frm:input path="cno"/> </td>
       </tr>
       <tr>
         <td>  customer name :: </td>
         <td>  <frm:input path="cname"/> </td>
       </tr>
   
   <tr>
         <td>  customer address :: </td>
         <td>  <frm:input path="cadd"/> </td>
       </tr>
   
   <tr>
         <td>  customer billAmt :: </td>
         <td>  <frm:input path="billAmt"/> </td>
       </tr>
   
   <tr>
         <td> <input type="submit"  value="register">  </td>
         <td> <input type="reset"  value="cancel">  </td>
       </tr>
   
   
   </table>

</frm:form>