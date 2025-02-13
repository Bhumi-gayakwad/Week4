package queue_interface.hospital_triage_system;

public class Patient  implements Comparable<Patient>{
    private String name;
    private int priority;

    public int getPriority(){
        return this.priority;
    }

    Patient(String name, int priority){
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient other){
        return Integer.compare(other.getPriority(), this.getPriority());
    }

    @Override
    public String toString(){
        return "Name: " + this.name + ". Priority: " + this.priority;
    }

}

