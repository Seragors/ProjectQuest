package service;

public class GameService {
    private final String accept = "accept";
    private final String reject = "reject";
    private final String acceptIndex = "capitan.jsp";
    private final String rejectIndex = "lose.jsp";
    private String accepted;
    public String call(String choice) {
        if (accept.equals(choice)) {
            accepted = acceptIndex;
        } else if (reject.equals(choice)) {
            accepted = rejectIndex;
        }
        return accepted;
    }
}