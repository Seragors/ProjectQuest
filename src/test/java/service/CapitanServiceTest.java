package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitanServiceTest {
    private final String testAccept = "whoAreYou.jsp";
    private final String testReject = "lose.jsp";
    private final String accept = "accept";
    private final String reject = "reject";

    @Test
    void testAcceptCheck() {
        CapitanService answer = new CapitanService();
        assertEquals(testAccept, answer.call(accept));
    }

    @Test
    void testRejectCheck() {
        CapitanService answer = new CapitanService();
        assertEquals(testReject, answer.call(reject));
    }
}