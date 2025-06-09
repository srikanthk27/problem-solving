import java.util.Scanner;

public class BinarySearchArray {
    public static void printArray(int arr[]){
        for(int x:arr){
            System.out.println(x+" ");
        }
        System.out.println(" ");
    }
    public static 


    public static boolean BinarySearch(int arr[],int n){
        int first=0;
        int last=arr.length-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(arr[mid]==n){
                return true;
            }else if(arr[mid]<n){
                first=mid+1;
            }else if(arr[mid]>n){
                last=mid-1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        int arr []={1,2,3,4,5,6,7,8,9,10,20,25,30,45,21,54};
        System.out.println("enter a number you want to search ");
        int n =scan.nextInt();
        if(BinarySearch(arr,n)){
            System.out.println(" Number is present in array");
            System.out.println("\narray: \n");
            printArray(arr);
        }else{
            System.out.println("Number is not present in array ");
            System.out.println("\narray: \n");
            printArray(arr);
        }
         scan.close();


    }
}
