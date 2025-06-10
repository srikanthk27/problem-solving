import java.util.*;
public class Twodimensional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the Rows ");
        int rows=scan.nextInt();
        System.out.println(" Enter the cols ");
        int cols=scan.nextInt();
        int arr [][]=new int[rows][cols];
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("enter the elemet of "+(i+1)+"row and "+(j+1)+"coloumn :");
                arr[i][j]=scan.nextInt();
            }
        }
        int max=arr[0][0];
        int max_row=0;
        int max_clo=0;


        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                //System.out.println(arr[i][j]);
                if(max<arr[i][j]){
                    max=arr[i][j];
                    max_row=i;
                    max_clo=j;

                }
            }
        }
        System.out.println(" Max element "+max);
        System.out.println("element found at "+max_row+" row and "+max_clo+" coloumn");
        

    }
    
}
