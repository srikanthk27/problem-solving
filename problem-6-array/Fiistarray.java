import java.util.*;

public class Fiistarray {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the total count ");
        int total=scan .nextInt();
        int []arr=new int[total];
        System.out.println(" enter the "+total+" numbers you want to add");
        for(int i=0;i<total;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("\nyour array elements :\n");
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        double average=0;
        int evencount=0;
        int oddcount=0;
        int reversearr[]=new int[total];

        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
            sum+=arr[i];
            average=(double)sum/(double)total;
            if(arr[i]%2==0){
                evencount++;
            }
            if(arr[i]%2!=0){
                oddcount++;
            }
            

            

        }

        for(int i=0;i<arr.length;i++){
            reversearr[i]=arr[arr.length-1-i];
            
        }
        System.out.println("\nyour reverse array elements :\n");
        for(int i=0;i<reversearr.length;i++){
            System.out.println(reversearr[i]);

        }
        System.out.println("\nMaximum number is "+max);
        System.out.println("\nMinimum number is "+min);
        System.out.println("\nSum of all number  "+sum);
        System.out.println("\naverage :"+average);
        System.out.println("\n Even numbers count : "+evencount);
        System.out.println("\nodd numbers count : "+oddcount);


    }
    
}
