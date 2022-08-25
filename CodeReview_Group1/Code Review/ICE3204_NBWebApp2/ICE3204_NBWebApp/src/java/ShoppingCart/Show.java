package ShoppingCart;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tazqia,Niloy,Tanjil,Ismail,Tanveer
 */
public class Show extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
       
        }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
            //implicitly creates the HTTP session object if not created yet
            ServletContext sc = getServletContext(); 
            
            // direct to server resource located at Books page
            sc.getRequestDispatcher("/ViewModel2/Books.html").forward(request, response); 
  
        
    }
}
