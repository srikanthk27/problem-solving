
public class Main {
    public static void main(String[] args) {
        Student student1=new Student("Srikanth",10,43);
        Student student2=new Student("Sri",11,48);
        student1.displayInfo();
        student1.markCheck();
        student2.displayInfo();
        student2.markCheck();


        if(student1.mark>student2.mark){
            System.out.println(student1.name+" is the highest scorer");
        }else{
            System.out.println(student2.name+" is the highest scorer");
        }
        
    }
}
