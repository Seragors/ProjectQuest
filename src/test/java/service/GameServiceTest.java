package service;

import constant.Constants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {
    private final String testAccept = "capitan.jsp";
    private final String testReject = "lose.jsp";

    @Test
    void testAcceptCheck() {
        GameService answer = new GameService();
        assertEquals(testAccept, answer.call(Constants.accept));
    }

    @Test
    void testRejectCheck() {
        GameService answer = new GameService();
        assertEquals(testReject, answer.call(Constants.reject));
    }
}