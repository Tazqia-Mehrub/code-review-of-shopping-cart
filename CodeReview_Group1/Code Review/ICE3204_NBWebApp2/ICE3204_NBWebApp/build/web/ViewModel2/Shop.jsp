<%-- 
    Document   : Login
    Created on : Aug 04, 2018, 11:16:12 PM
    Author     : Tazqia,Niloy,Tanjil,Ismail,Tanveer
--%>

<html>
    <%            
            String[] values = (String [])session.getAttribute("cart");
             //If any book is selected from the cart, the list of selected books will be shown
            if (values != null) {

            int length = values.length;%>
            Your cart status is ==== 
            <BR>

          <%  for (int i = 0; i < length; i++) {%>
                <BR> <%=values[i]%>;
           <% } %>
            
           
           <form method="post" action="show" ><INPUT TYPE=SUBMIT VALUE='Go Shopping'>  </form>
           <form method="get" action="log" ><INPUT TYPE=SUBMIT VALUE='logout'>  </form>
        <%} 
           else {  //If no book is selected from the cart, no list of books will be shown
        %> 
            You have not selected any book
               <form method="post" action="show" ><INPUT TYPE=SUBMIT VALUE='Go Shopping'>  </form>
               <form method="get" action="log" ><INPUT TYPE=SUBMIT VALUE='logout'>  </form>
        <%}%>
          
  
</html>       