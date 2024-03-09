package servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.GameService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/game")
public class GameServlet extends HttpServlet {
    private GameService gameService = new GameService();
    private int number = 1;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer = gameService.call(request.getParameter("choice"));
        HttpSession session = request.getSession();

        response.setStatus(200);
        request.setAttribute("answer", answer);
        request.getRequestDispatcher(answer).forward(request, response);
        incrementsGames(session);
    }
    private void incrementsGames(HttpSession session) {
        Integer player = (Integer) session.getAttribute("player");
        if (player == null) {
            player = number;
        } else {
            player++;
        }
        session.setAttribute("player", player);
    }
}