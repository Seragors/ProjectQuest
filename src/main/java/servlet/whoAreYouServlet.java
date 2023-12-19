package servlet;

import service.whoAreYouService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/whoAreYou")
public class whoAreYouServlet extends HttpServlet {
    private whoAreYouService whoAreYouService = new whoAreYouService();
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer = whoAreYouService.call(request.getParameter("choice"));
        HttpSession session = request.getSession();

        response.setStatus(200);
        request.setAttribute("answer", answer);
        request.getRequestDispatcher(String.valueOf(answer)).forward(request, response);
    }
}
