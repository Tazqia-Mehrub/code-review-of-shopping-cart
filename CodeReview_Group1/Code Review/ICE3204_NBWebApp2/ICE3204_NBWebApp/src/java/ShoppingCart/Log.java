package ShoppingCart;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
public class Log extends HttpServlet {

    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
                             
            HttpSession session = request.getSession(true); //returns a new session
            session.invalidate();//When user login to the application after Session Times out,his previous session data is no more required and a new session for the user is created 
            Cookie userNameCookieRemove = new Cookie("userName", ""); //removing cookies is a user logout action – removes data which was stored for an active user session
            userNameCookieRemove.setMaxAge(0); //To remove a cookie from the browser,a new one to the response with the same name is added, but with a maxAge value set to 0
            response.addCookie(userNameCookieRemove); //New cookie is added to save new response for an active user session
            ServletContext sc = getServletContext();//implicitly creates the HTTP session object if not created yet
              
            sc.getRequestDispatcher("/ViewModel2/Books.html").forward(request, response);

    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
           String userName = request.getParameter("userName"); //input username
           String password = request.getParameter("password"); //input password
           
          
           
        
        
           if (userName != null && password != null
                && userName.equals("a") && password.equals("b")) {
         
            
            String aa =  "n";
            request.setAttribute("t", aa);    
            
            RequestDispatcher rd = request.getRequestDispatcher("/ViewModel2/Shop.jsp");
            rd.forward(request, response);
        
            //If the Username and Password is valid, the Login page directs to the Shop page

          } 
           else {
            
           String aa =  "no";
           request.setAttribute("t", aa);
           ServletContext sc = getServletContext();
           
           //If the Username and Password is not valid, the Login page redirects to the Login Page and displays error message to re-enter Username and Password
           String message = "Login failed. Please try again ";
           request.setAttribute("message", message);

           sc.getRequestDispatcher("/ViewModel2/Login.jsp").forward(request, response);
           
           
        }
        
    }

}
