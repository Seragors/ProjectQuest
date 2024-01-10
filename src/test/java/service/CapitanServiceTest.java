package service;

import constant.Constants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitanServiceTest {
    private final String testAccept = "whoAreYou.jsp";
    private final String testReject = "lose.jsp";

    @Test
    void testAcceptCheck() {
        CapitanService answer = new CapitanService();
        assertEquals(testAccept, answer.call(Constants.accept));
    }

    @Test
    void testRejectCheck() {
        CapitanService answer = new CapitanService();
        assertEquals(testReject, answer.call(Constants.reject));
    }
}