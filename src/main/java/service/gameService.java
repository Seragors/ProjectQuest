package service;

public class gameService {

    public String call(String choice) {
         String accepted  = null;
        if ("accept".equals(choice)) {
            accepted = ("capitan.jsp");
        } else if ("reject".equals(choice)){
            accepted = ("lose.jsp");
        }
        return accepted;
    }
}
