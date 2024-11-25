import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class url2 extends HttpServlet {
   public url2() {
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try {
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
         
         // Retrieve the monument name from the URL parameter
         String monument = request.getParameter("monument");
         
         // Display detailed information about the monument
         out.print("<h1>Details about " + monument + "</h1>");
         
         if ("Brihadeeswara Temple".equalsIgnoreCase(monument)) {
            out.print("<p>The Brihadeeswara Temple is located in Thanjavur and is a UNESCO World Heritage Site.</p>");
         } else if ("Shore Temple".equalsIgnoreCase(monument)) {
            out.print("<p>The Shore Temple is located in Mahabalipuram and is known for its beautiful seaside view.</p>");
         } else if ("Meenakshi Temple".equalsIgnoreCase(monument)) {
            out.print("<p>The Meenakshi Temple is located in Madurai and is famous for its intricate architecture.</p>");
         } else if ("Rockfort".equalsIgnoreCase(monument)) {
            out.print("<p>The Rockfort Temple is a historic fort and temple complex in Tiruchirappalli.</p>");
         } else {
            out.print("<p>Information about this monument is not available.</p>");
         }
         
         out.close();
      } catch (Exception e) {
         System.out.println(e);
      }
   }
}
