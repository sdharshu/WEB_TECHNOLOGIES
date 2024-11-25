import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/monument")
public class BrihadeeshwaraTempleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type to HTML
        response.setContentType("text/html");
        
        // Get the PrintWriter to write response
        PrintWriter out = response.getWriter();

        // Start writing the HTML response
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Brihadeeshwara Temple</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 20px; }");
        out.println("h1 { color: #b5651d; }");
        out.println("h2 { color: #6b4226; }");
        out.println("p { line-height: 1.6; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>Brihadeeshwara Temple</h1>");
        out.println("<h2>Overview</h2>");
        out.println("<p>The Brihadeeshwara Temple, also known as Peruvudaiyar Kovil or RajaRajeswaram, is one of the largest temples in India and a prime example of Tamil architecture during the Chola Dynasty. "
                + "Located in Thanjavur, Tamil Nadu, this Hindu temple is dedicated to Lord Shiva and is one of the most significant temples of South India. It is part of the UNESCO World Heritage site known as the 'Great Living Chola Temples'.</p>");
        
        out.println("<h2>History</h2>");
        out.println("<p>The temple was built by Raja Raja Chola I between 1003 and 1010 AD. It is a testament to the advanced architectural knowledge and engineering skills of that time. "
                + "The temple was constructed in granite, which had to be transported from miles away, and is one of the tallest temples in India. The temple tower, or vimana, rises to a height of 66 meters, making it one of the tallest structures of its kind in the world.</p>");
        
        out.println("<h2>Architecture</h2>");
        out.println("<p>The Brihadeeshwara Temple showcases Dravidian architecture, with intricate sculptures and paintings that depict various aspects of Hindu mythology. "
                + "The temple complex includes a large courtyard, shrines, and massive entrances. A significant feature of the temple is the Nandi statue, a monolithic sculpture of Shiva's sacred bull, which weighs approximately 25 tons.</p>");
        
        out.println("<h2>Notable Features</h2>");
        out.println("<ul>");
        out.println("<li><strong>Vimana:</strong> The towering structure over the sanctum is one of the tallest in India and is topped by an 80-ton stone dome.</li>");
        out.println("<li><strong>Nandi:</strong> The massive bull statue is carved from a single rock and is one of the largest Nandi statues in India.</li>");
        out.println("<li><strong>Frescoes:</strong> The temple walls are adorned with beautiful frescoes and inscriptions in Tamil and Sanskrit that offer insights into the history and culture of the Chola period.</li>");
        out.println("</ul>");

        out.println("<h2>UNESCO Heritage Status</h2>");
        out.println("<p>In 1987, the Brihadeeshwara Temple was declared a UNESCO World Heritage Site. It is recognized for its historical, cultural, and architectural significance. "
                + "The temple, along with the other Great Living Chola Temples, highlights the architectural brilliance of the Chola Dynasty and remains a popular pilgrimage site and tourist attraction.</p>");

        out.println("<h2>Visit and Experience</h2>");
        out.println("<p>Visitors to the Brihadeeshwara Temple are often awestruck by its massive scale, exquisite detailing, and the stories that its walls and sculptures tell. "
                + "The temple is still functional, and numerous religious ceremonies and festivals are held here throughout the year, adding to the cultural richness of this ancient monument.</p>");

        out.println("<p><em>Experience the grandeur and spirituality of Brihadeeshwara Temple—a marvel of Indian architecture and an enduring symbol of the Chola dynasty's legacy.</em></p>");
        
        out.println("</body>");
        out.println("</html>");
    }
}
