import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class url1 extends HttpServlet {
   public url1() {
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try {
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
         
         // Retrieve the monument name from the URL parameter
         String monument = request.getParameter("monument");
         
         // Display the welcome message and link to the next page
         out.print("Welcome to " + monument + " details page\n");
         out.print("<a href='http://localhost:8080/4033/url2?monument=" + monument + "'>Visit the details page for " + monument + "</a>");
         out.close();
      } catch (Exception e) {
         System.out.println(e);
      }
   }
}
