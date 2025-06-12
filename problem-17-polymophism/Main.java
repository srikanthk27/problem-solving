public class Main {
    public static void main(String[] args) {
       Shape [] shapes = new Shape[3];
       shapes [0]= new Rectangle();
       shapes [1]= new Round();
       shapes [2]= new Triangle();
       for(Shape x : shapes){
        x.draw();
       }
    

    }
    



}
