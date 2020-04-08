import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculator", urlPatterns = "/display-discount")
public class Calculator extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String description = request.getParameter("Product_Description");
        String listPriceStr = request.getParameter("List_Price");
        //TODO: valid listPrice in frontend
        float listPrice = (listPriceStr != null && !listPriceStr.isEmpty()) ?
                Float.parseFloat(listPriceStr) : 0.0f;
        //TODO
        float discountPercent = Float.parseFloat(request.getParameter("Discount_Percent"));
        double discountAmount = listPrice * discountPercent * 0.1;
        double discountPrice = listPrice - discountAmount;

        PrintWriter printWriter = response.getWriter();
        String htmlResponse = "";
        String appName = "Product Discount Calculator";
        htmlResponse += "<html>";
        htmlResponse += "<h1>" + appName + "</h1>";
        htmlResponse += "Product_Description:" + description + "</br>";
        htmlResponse += "List_Price:" + listPrice + "</br>";
        htmlResponse += "Discount_Percent:" + discountPercent + "</br>";
        htmlResponse += "Discount_Amount:" + discountAmount + "</br>";
        htmlResponse += "Discount_Price:" + discountPrice;
        htmlResponse += "<style> h1,p {color: yellow}</style>"
                + "<h1>Hello World!</h1>"
                + "<p>Welcome to the Web App";
        htmlResponse += "</html>";
        printWriter.println(htmlResponse);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
