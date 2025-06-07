import java.util.Scanner;
public class Fizzbuzz {
    public static void main(String args []){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num =scan.nextInt();
        if(num%3==0 && num %5==0 ){
            System.out.println(num+" : Fizz Buzz");
            
        }else if(num%3 ==0 ){
            System.out.println(num +" : fizz");

        }else if (num %5==0){
            System.out.println(num+" : buzz");
        }else{
            System.out.println(num+" is not devided by 3 or 5 ");
        }
        System.err.println( " \nloop: \n");

        for(int i=1;i<=num;i++){
            if(i%3==0 &&  i%5==0 ){
                System.out.println(i+" : Fizz Buzz");
                
            }else if(i%3 ==0 ){
                System.out.println(i +" : fizz");
    
            }else if (i %5==0){
                System.out.println(i+" : buzz");
            }else{
                System.out.println(i+" is not devided by 3 or 5 ");
            }
        }

    }
}