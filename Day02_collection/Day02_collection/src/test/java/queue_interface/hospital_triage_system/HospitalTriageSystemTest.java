package queue_interface.hospital_triage_system;

import org.junit.jupiter.api.Test;
import java.util.PriorityQueue;
import static org.junit.jupiter.api.Assertions.*;

public class HospitalTriageSystemTest {

    @Test
    void testPriorityOrder() {
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        pq.add(new Patient("Patient A", 3));
        pq.add(new Patient("Patient B", 1));
        pq.add(new Patient("Patient C", 2));
        pq.add(new Patient("Patient D", 5));

        assertEquals("Name: Patient D. Priority: 5", pq.poll().toString());
        assertEquals("Name: Patient A. Priority: 3", pq.poll().toString());
        assertEquals("Name: Patient C. Priority: 2", pq.poll().toString());
        assertEquals("Name: Patient B. Priority: 1", pq.poll().toString());
    }

    @Test
    void testSamePriority() {
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        pq.add(new Patient("Patient X", 2));
        pq.add(new Patient("Patient Y", 2));

        assertEquals(2, pq.poll().getPriority());
        assertEquals(2, pq.poll().getPriority());
    }

    @Test
    void testEmptyQueue() {
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        assertNull(pq.poll());
    }
}
