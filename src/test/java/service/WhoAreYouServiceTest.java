package service;

import constant.Constants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhoAreYouServiceTest {
    private final String testAccept = "win.jsp";
    private final String testReject = "lose.jsp";

    @Test
    void testAcceptCheck() {
        WhoAreYouService answer = new WhoAreYouService();
        assertEquals(testAccept, answer.call(Constants.accept));
    }

    @Test
    void testRejectCheck() {
        WhoAreYouService answer = new WhoAreYouService();
        assertEquals(testReject, answer.call(Constants.reject));
    }
}