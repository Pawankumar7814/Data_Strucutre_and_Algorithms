import java.util.Scanner;

public class SwapAlternate {
    public static Scanner sc = new Scanner(System.in);

    // To take the input from the user for array
    public static int[] takeInput(){
        int n = sc.nextInt(); // take input from the user for size of an array
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return  arr;
    }

    // Function to print array
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    // To swap alternate element of the array
    public static void swapAlternate(int[] arr) {
        //Your code goes here
        for(int i = 0; i < arr.length - 1; i += 2){
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = takeInput();
        swapAlternate(arr);
        printArray(arr);
    }
}
