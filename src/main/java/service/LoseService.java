package service;

import constant.Constants;

public class LoseService {
    private final String acceptIndex = "index.jsp";
    private final String rejectIndex = "lose.jsp";

    public String call(String choice) {
        String result = null;
        if (Constants.accept.equals(choice)) {
            result = acceptIndex;
        } else if (Constants.reject.equals(choice)) {
            result = rejectIndex;
        }
        return result;
    }
}