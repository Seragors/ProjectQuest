package service;

import constant.Constants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoseServiceTest {
    private final String testAccept = "index.jsp";
    private final String testReject = "lose.jsp";

    @Test
    void testAcceptCheck() {
        LoseService answer = new LoseService();
        assertEquals(testAccept, answer.call(Constants.accept));
    }

    @Test
    void testRejectCheck() {
        LoseService answer = new LoseService();
        assertEquals(testReject, answer.call(Constants.reject));
    }
}