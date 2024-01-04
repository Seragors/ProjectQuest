package service;

public class loseService {
    public String call(String choice) {
        String accepted  = null;
        if ("accept".equals(choice)) {
            accepted = ("index.jsp");
        } else if ("reject".equals(choice)){
            accepted = ("lose.jsp");
        }
        return accepted;
    }
}