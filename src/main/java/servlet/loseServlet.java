package servlet;

import service.loseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/")
public class loseServlet extends HttpServlet {
    private loseService loseService = new loseService();
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer = loseService.call(request.getParameter("choice"));
        request.getSession().invalidate();

        response.setStatus(200);
        request.setAttribute("answer", answer);
        request.getRequestDispatcher(String.valueOf(answer)).forward(request, response);
    }
}