package servlet;

import service.LoseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class LoseServlet extends HttpServlet {
    private LoseService loseService = new LoseService();
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer = loseService.call(request.getParameter("choice"));
        request.getSession().invalidate();

        response.setStatus(200);
        request.setAttribute("answer", answer);
        request.getRequestDispatcher(answer).forward(request, response);
    }
}