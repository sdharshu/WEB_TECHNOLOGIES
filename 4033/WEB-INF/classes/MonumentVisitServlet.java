import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

@WebServlet("/session")
public class MonumentVisitServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        // Get the name of the monument from the request
        String monumentName = request.getParameter("monument");
        
        // Get the session object
        HttpSession session = request.getSession();
        
        // Retrieve the visit count for this monument from the session
        Integer visitCount = (Integer) session.getAttribute(monumentName);
        if (visitCount == null) {
            visitCount = 0; // If null, this is the first visit
        }
        
        // Increment the visit count
        visitCount++;
        
        // Update the session with the new visit count
        session.setAttribute(monumentName, visitCount);
        
        // Display the response
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h1>Monument Visit Tracker</h1>");
            out.println("<p>You have visited the monument <strong>" + monumentName + "</strong> " + visitCount + " times.</p>");
            
            out.println("</body></html>");
        }
    }
}
