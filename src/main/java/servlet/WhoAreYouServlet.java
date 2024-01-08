package servlet;

import service.WhoAreYouService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/whoAreYou")
public class WhoAreYouServlet extends HttpServlet {
    private WhoAreYouService whoAreYouService = new WhoAreYouService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer = whoAreYouService.call(request.getParameter("choice"));

        response.setStatus(200);
        request.setAttribute("answer", answer);
        request.getRequestDispatcher(answer).forward(request, response);
    }
}