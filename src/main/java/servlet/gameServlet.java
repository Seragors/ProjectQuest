package servlet;
import service.gameService;
import service.incrementUsers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/game")
public class gameServlet extends HttpServlet {
    public incrementUsers incrementUsers = new incrementUsers();
    private gameService gameService = new gameService();

    private int count = 1;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer = gameService.call(request.getParameter("choice"));
        HttpSession session = request.getSession();

        response.setStatus(200);
        request.setAttribute("answer", answer);
        request.getRequestDispatcher(String.valueOf(answer)).forward(request, response);
    }

}
