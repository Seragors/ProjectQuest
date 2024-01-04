package service;

public class winService {
    public String call(String choice) {
        String accepted = null;
        if ("accept".equals(choice)) {
            accepted = ("index.jsp");
        }
        return accepted;
    }
}