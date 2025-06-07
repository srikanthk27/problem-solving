
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of rows :");
        int row =scan.nextInt();
        System.out.println(" \nyour pattern :\n");
        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.err.println();
        }
    }
    
}
