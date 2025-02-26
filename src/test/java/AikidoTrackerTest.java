import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AikidoTrackerTest {
    static AikidoTracker tracker;

    @BeforeEach
    void setUp() {
        tracker = new AikidoTracker();
    }

    @Test
    void testAddDays() {
        tracker.addDays(10);
        assertEquals(10, tracker.getDays(), "Days must be added.");
    }

    @Test
    void testAddAmount() {
        tracker.addAmount(10);
        assertEquals(10, tracker.getAmount(), "Amount must be added.");
    }

    @Test
    void setDuration() {
        tracker.setDuration(60);
        assertEquals(60, tracker.seeDuration(), "Duration must be set.");
    }

    @Test
    void seeDuration() {
        tracker.setDuration(120);
        assertEquals(120, tracker.seeDuration(), "Duration must be seen.");
    }

    @Test
    void addTrainingSession() {
        tracker.addTrainingSession(10, 60);
        assertEquals(10, tracker.getAmount(), "Amount must be added.");
        assertEquals(1, tracker.getDays(), "Days must be added.");
        assertEquals(60, tracker.seeDuration(), "Duration must be set.");
    }

    @Test
    void isEligibleForGraduation() {
        tracker.addAmount(100);
        assertTrue(tracker.isEligibleForGraduation(), "Eligible for graduation.");
        tracker.clearAmount();
        tracker.addAmount(50);
        assertFalse(tracker.isEligibleForGraduation(), "Not eligible for graduation.");
        tracker.clearAmount();
        tracker.addDays(183);
        assertTrue(tracker.isEligibleForGraduation(), "Eligible for graduation.");
    }
}