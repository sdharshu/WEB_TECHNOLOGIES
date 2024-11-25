import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class h1 extends HttpServlet {
   public h1() {
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try {
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
         
         // Retrieve monument name from the user input
         String monumentName = request.getParameter("monumentName");
         
         // Display response on first page
         out.print("You chose: " + monumentName);
         out.print("<form action='http://localhost:8080/4033/h2' method='POST'>");
         out.print("<input type='hidden' name='monumentName' value='" + monumentName + "'>");
         out.print("<input type='submit' value='See More'>");
         out.print("</form>");
         out.close();
      } catch (Exception e) {
         System.out.println(e);
      }
   }
}
