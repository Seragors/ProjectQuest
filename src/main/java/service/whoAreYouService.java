package service;

public class whoAreYouService {
    public String call(String choice) {
        String accepted  = null;
        if ("accept".equals(choice)) {
            accepted = ("win.jsp");
        } else if ("reject".equals(choice)){
            accepted = ("lose.jsp");
        }
        return accepted;
    }
}