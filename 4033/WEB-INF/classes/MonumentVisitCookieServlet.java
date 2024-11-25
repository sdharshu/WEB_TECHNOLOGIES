import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/cookie")
public class MonumentVisitCookieServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Get the monument name from the request
        String monumentName = request.getParameter("monument");

        // Default visit count if cookie is not found
        int visitCount = 0;

        // Check if the cookie for this monument already exists
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(monumentName)) {
                    // Parse visit count from cookie
                    visitCount = Integer.parseInt(cookie.getValue());
                    break;
                }
            }
        }

        // Increment visit count
        visitCount++;

        // Update the cookie with the new visit count
        Cookie visitCookie = new Cookie(monumentName, String.valueOf(visitCount));
        visitCookie.setMaxAge(24 * 60 * 60); // Cookie will expire in 1 day
        response.addCookie(visitCookie);

        // Display the response
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h1>Monument Visit Tracker</h1>");
            out.println("<p>You have visited the monument <strong>" + monumentName + "</strong> " + visitCount + " times.</p>");
        
            out.println("</body></html>");
        }
    }
}
