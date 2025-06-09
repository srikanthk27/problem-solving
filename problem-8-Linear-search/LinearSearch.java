import java.util.Scanner;

public class LinearSearch {
    public static void printArray(int arr[]){
        for(int x:arr){
            System.out.println(x);
        }
    }
    public boolean search(int arr[],int n){
        for(int x:arr){
            if(x==n){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        LinearSearch s = new LinearSearch();
        int arr []={1,2,3,4,5,6,7,8,9,10,20,25,30,45,21,54};
        System.out.println("enter a number you want to search ");
        int n =scan.nextInt();
        if(s.search(arr,n)){
            System.out.println(" Number is present in array");
            System.out.println("\narray: \n");
            printArray(arr);
        }else{
            System.out.println("Number is not present in array ");
            System.out.println("\narray: \n");
            printArray(arr);
        }


    }
}
