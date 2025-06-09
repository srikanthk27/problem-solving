public class Reversearray {

    public static void reversedArray(int arr[]){
        int x=0;
        int y=arr.length-1;
        while(x<y){
            int temp =arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            x++;
            y--;

        }
    }
    public static void printArray(int arr []){
        for(int x : arr){
            System.out.println(x);
        }
    }

    
    public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        
        printArray(arr);
        reversedArray(arr);
        System.out.println("\nreversed array\n");
        printArray(arr);
}
}
