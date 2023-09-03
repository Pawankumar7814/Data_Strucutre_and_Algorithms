import java.util.Scanner;

public class ArrangeNumbersInArray {
    public static Scanner sc = new Scanner(System.in);

    // Function to print array
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    // Function to arrange the array
    public static void arrange(int[] arr, int n) {
        //Your code goes here
        int start = 0, end = n-1;
        int val = 1;
        while(start <= end){
            if(val % 2 != 0){
                arr[start] = val;
                val++; start++;
            }else{
                arr[end] = val;
                val++; end--;
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        arrange(arr, arr.length);
        printArray(arr);
    }

}
