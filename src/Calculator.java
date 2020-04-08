import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "Calculator" , urlPatterns = "/display-discount")
public class Calculator extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

           String description  = request.getParameter("Product_Description");
           float list_price = Float.parseFloat(request.getParameter("List_Price"));
           float discount_percent = Float.parseFloat(request.getParameter("Discount_Percent"));
           double discount_amount = list_price * discount_percent * 0.1;
           double discount_price = list_price - discount_amount;

           PrintWriter printWriter = response.getWriter();
           String h1 = "Product Discount Calculator";
           printWriter.println("<html>");
           printWriter.println("<h1>" +h1 +"</h1>");
           printWriter.println("Product_Description:" +description +"</br>");
           printWriter.println("List_Price:" +list_price +"</br>");
           printWriter.println("Discount_Percent:" +discount_percent + "</br>");
           printWriter.println("Discount_Amount:" +discount_amount +"</br>");
           printWriter.println("Discount_Price:" +discount_price);
           printWriter.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
