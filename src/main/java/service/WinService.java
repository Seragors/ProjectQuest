package service;

public class WinService {
    private final String accept = "accept";
    private final String acceptIndex = "index.jsp";
    private String accepted;

    public String call(String choice) {
        if (accept.equals(choice)) {
            accepted = acceptIndex;
        }
        return accepted;
    }
}