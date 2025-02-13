package queue_interface.hospital_triage_system;
import java.util.PriorityQueue;
public class HospitalTriageSystem {
    public static void main(String[] args) {

        PriorityQueue<Patient> pq = new PriorityQueue<>();

        pq.add(new Patient("patient 2", 2));
        pq.add(new Patient("patient 3", 3));
        pq.add(new Patient("patient 1", 1));
        pq.add(new Patient("patient 1", 4));
        pq.add(new Patient("patient 1", 5));

        while (!pq.isEmpty()) System.out.println(pq.poll());

    }
}
