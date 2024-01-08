package servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

public class IncrementGames extends HttpServlet {
    private int number = 1;

    public void incrementsGames(HttpSession session) {
        Integer player = (Integer) session.getAttribute("player");
        if (player == null) {
            player = number;
        } else {
            player++;
        }
        session.setAttribute("player", player);
    }
}