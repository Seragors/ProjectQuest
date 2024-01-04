package service;

import javax.servlet.http.HttpSession;

public class incrementGames {
    public void incrementsGames(HttpSession session) {
        Integer player = (Integer) session.getAttribute("player");
        if (player == null) {
            player = 1;
        } else {
            player++;
        }
        session.setAttribute("player", player);
    }
}