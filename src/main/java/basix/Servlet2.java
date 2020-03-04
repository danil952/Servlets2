package basix;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//задача - вытащить параметр из request
//убедиться, что без обработки NumberFormatException сервлет нормально не запускается, "вылетает"
//поработать с указанием параметра прямо в адресной строке: http://localhost:8080/Servlet2?numberName=3 и т.д.

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String paramName = request.getParameter(UsefulNotes.numberName);

            response.setContentType("text/html; charset=UTF-8");
            try {
                int i = Integer.parseInt(paramName);
                response.getWriter().print(i);
            } catch (NumberFormatException e) {
                response.getWriter().print("Не получается ...");

            }


    }
}
