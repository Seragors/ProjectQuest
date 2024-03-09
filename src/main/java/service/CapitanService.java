package service;

import constant.Constants;

public class CapitanService {
    private final String acceptIndex = "whoAreYou.jsp";
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