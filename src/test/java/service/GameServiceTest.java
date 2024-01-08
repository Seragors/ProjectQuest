package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {
    private final String testAccept = "capitan.jsp";
    private final String testReject = "lose.jsp";
    private final String accept = "accept";
    private final String reject = "reject";

    @Test
    void testAcceptCheck() {
        GameService answer = new GameService();
        assertEquals(testAccept, answer.call(accept));
    }

    @Test
    void testRejectCheck() {
        GameService answer = new GameService();
        assertEquals(testReject, answer.call(reject));
    }
}