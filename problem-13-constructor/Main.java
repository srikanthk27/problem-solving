public class Main{
    public static void main(String[] args) {
        Book book1=new Book();
        Book book2=new Book("rome");
        Book book3=new Book("tharun","rome",40);
        book1.displayinfo();
        book2.displayinfo();
        book3.displayinfo();


    }
}