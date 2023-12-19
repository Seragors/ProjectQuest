package service;

import javax.servlet.http.HttpSession;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class incrementUsers {
    public void incrementsUsers(HttpSession session) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        Integer player = (Integer) session.getAttribute("player");
        if (player == null) {
            player = 1;
        } else {
            player++;
        }
        session.setAttribute("player", player);
    }
}
