public class Student {
    String name;
    int rollno;
    int mark;
    public Student(String name,int rollno,int mark){
        this.name=name;
        this.rollno=rollno;
        this.mark=mark;

    }

    void displayInfo(){
        System.out.println("Student name :"+name+"\nStudnet rollno : "+rollno+"\nStudent mark :"+mark);
    }
    boolean markCheck(){
        int qualify=35;
        if(mark>qualify){
            System.out.println("Student result : pass \n");
            return true;
        }
        System.out.println("Student result : fail\n");
        return false;
    }


    
    
}
