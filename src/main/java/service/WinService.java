package service;

import constant.Constants;

public class WinService {
    private final String acceptIndex = "index.jsp";

    public String call(String choice) {
        String result = null;
        if (Constants.accept.equals(choice)) {
            result = acceptIndex;
        }
        return result;
    }
}