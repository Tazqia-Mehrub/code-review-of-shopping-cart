package ShoppingCart;


import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tazqia,Niloy,Tanjil,Ismail,Tanveer
 */
public class BookServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String[] values = request.getParameterValues("book"); //
        
        //if there is no current session, returns a new session
        HttpSession session = request.getSession(true);   
        session.setAttribute("cart", values);
        
        //Reading cookies
        Cookie[] cookies = request.getCookies();  
       
        
       Boolean loggedIn=false;
       
       
        if (cookies!=null){
         //when the user is not logged in
       //if there are book value stored in the cart 
       //then iterating through the array of cookies we will find the books selected from the cart after Matching Username and Password value   
       
        for(Cookie cookie : cookies){
            if("a".equals(cookie.getValue()) && "userName".equals(cookie.getName())){
           
                //If the cookie value machtes the Username and Password value, the Login page will direct to Shop page and view the selected books from the cart
               
                loggedIn=true;
                
            
                ServletContext sc = getServletContext();
                
                sc.getRequestDispatcher("/ViewModel2/Shop.jsp").forward(request, response); break;
            }
        }}
        if(!loggedIn){   
           //If not logged in, the page will  redirect to the Login page
            String aa =  "n";
            request.setAttribute("t", aa);
          
            ServletContext sc = getServletContext();
            sc.getRequestDispatcher("/ViewModel2/Login.jsp").forward(request, response);
        }
    }
}
