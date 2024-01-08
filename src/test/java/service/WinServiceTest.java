package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinServiceTest {
    private final String testAccept = "index.jsp";
    private final String accept = "accept";

    @Test
    void testAcceptCheck() {
        WinService answer = new WinService();
        assertEquals(testAccept, answer.call(accept));
    }
}