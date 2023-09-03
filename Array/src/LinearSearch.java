import java.util.Scanner;

public class LinearSearch {
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

    // Linear search funciton
    public static int linearSearch(int arr[], int x) {
        //Your code goes here
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = takeInput();
        int x = sc.nextInt();
        int ans = linearSearch(arr, x);
        System.out.println(ans);
    }
}
