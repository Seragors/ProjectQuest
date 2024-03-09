package servlet;

import service.WinService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/win")
public class WinServlet extends HttpServlet {
    private WinService winService = new WinService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer = winService.call(request.getParameter("choice"));

        response.setStatus(200);
        request.setAttribute("answer", answer);
        request.getRequestDispatcher(answer).forward(request, response);
    }
}