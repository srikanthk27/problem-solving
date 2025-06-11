

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer();
        Employee emp =new Employee();
        emp.name="sri";
        emp.salary=2000;
        dev.name="srikanth";

        dev.salary=5000;
        
        emp.displayInfo();
        System.err.println(" ");
        dev.programminglanguage="java";
        dev.displayInfo();
    }
}
