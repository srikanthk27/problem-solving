public class Book {
    String title;
    String author;
    int pages;
    public Book(){
        this.title="unknown";
        this.author="Unknown";
        this.pages=0;
    }
    public Book(String title){
        this.title=title;
        this.author="unknown";
        this.pages=0;
    }
    public Book(String title,String author,int pages){
        this.title=title;
        this.author=author;
        this.pages=pages;
    }
    void displayinfo(){
        System.out.println("authour : "+author+"\ntitle : "+title+"\npages : "+pages+"\n");
    }
}
