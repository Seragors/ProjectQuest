package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhoAreYouServiceTest {
    private final String testAccept = "win.jsp";
    private final String testReject = "lose.jsp";
    private final String accept = "accept";
    private final String reject = "reject";

    @Test
    void testAcceptCheck() {
        WhoAreYouService answer = new WhoAreYouService();
        assertEquals(testAccept, answer.call(accept));
    }

    @Test
    void testRejectCheck() {
        WhoAreYouService answer = new WhoAreYouService();
        assertEquals(testReject, answer.call(reject));
    }
}