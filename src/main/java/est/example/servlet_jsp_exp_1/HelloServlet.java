package est.example.servlet_jsp_exp_1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", urlPatterns = {"/"})
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String number = req.getParameter("number");

        int result = number == null
                ? 0
                : Integer.parseInt(number);

        req.setAttribute("result", result);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/HelloWorld.jsp");
        requestDispatcher.forward(req, resp);

    }

}
