package servlet;

import service.gameService;
import service.incrementGames;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/game")
public class gameServlet extends HttpServlet {
    private gameService gameService = new gameService();

    private incrementGames incrementGames = new incrementGames();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer = gameService.call(request.getParameter("choice"));
        HttpSession session = request.getSession();

        response.setStatus(200);
        request.setAttribute("answer", answer);
        request.getRequestDispatcher(String.valueOf(answer)).forward(request, response);
        incrementGames.incrementsGames(session);
    }
}