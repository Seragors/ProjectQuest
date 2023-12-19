package service;

public class capitanService {

    public String call(String choice) {
        String accepted  = null;
        if ("accept".equals(choice)) {
            accepted = ("whoAreYou.jsp");
        } else if ("reject".equals(choice)){
            accepted = ("lose.jsp");
        }
        return accepted;
    }
}
