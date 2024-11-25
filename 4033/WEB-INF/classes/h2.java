import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class h2 extends HttpServlet {
   public h2() {
   }

   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try {
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
         
         // Retrieve the hidden parameter 'monumentName'
         String monumentName = request.getParameter("monumentName");
         
         // Display message with the selected monument
         out.print("Hello! It's great that you are interested in " + monumentName + "!");
         out.print("<p>This monument is one of the finest examples of Tamil Nadu's rich history and architecture.</p>");
         out.close();
      } catch (Exception e) {
         System.out.println(e);
      }
   }
}
