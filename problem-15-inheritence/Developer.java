public class Developer extends Employee {
    String programminglanguage;

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("developing in "+programminglanguage);
    }
}
