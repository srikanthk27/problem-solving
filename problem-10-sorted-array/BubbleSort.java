import java.util.*;
public class BubbleSort {
    public static void printarray(int arr[]){
        for(int x:arr){
            System.out.println(x);
        }
    }
    public static void bubbleSortArray(int arr []){
        int n =arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr [j]=arr[j+1];
                    arr [j+1]=temp;

                }
            }
        }
    }
    public static boolean binarySearch(int arr[],int n){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==n){
                return true;
            }else if(arr[mid]<n){
                start=mid+1;
            }else if(arr[mid]>n){
                end=mid-1;
            }
            
        }
        return false;

    }
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        int arr []={4,5,6,7,9,219,940,4,3,5,2,1};
        printarray(arr);
      System.out.println("\nEnter a number you want to search in array ");
      int n=scan.nextInt();
        bubbleSortArray(arr);
        System.out.println("\n sorted array \n");
        printarray(arr);
        if(binarySearch(arr, n)){
            System.out.println(n+" number is present in array");
        }else{
            System.out.println(n+" number is not present in array");
        }


    }
    
}
