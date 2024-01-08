package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoseServiceTest {
    private final String testAccept = "index.jsp";
    private final String testReject = "lose.jsp";
    private final String accept = "accept";
    private final String reject = "reject";
    @Test
    void testAcceptCheck() {
        LoseService answer = new LoseService();
        assertEquals(testAccept, answer.call(accept));
    }
    @Test
    void testRejectCheck() {
        LoseService answer = new LoseService();
        assertEquals(testReject, answer.call(reject));
    }
}