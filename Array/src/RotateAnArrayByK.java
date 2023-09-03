import java.util.Scanner;

public class RotateAnArrayByK {
    public static Scanner sc = new Scanner(System.in);

    // To take the input from the user
    public static int[] takeInput(){
        int n = sc.nextInt(); // take input form the user for the size of array
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // To print the array
    public static void printArray(int[] arr, int n){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    // To rotate the array from K
    public static void rotateArray(int[] arr, int n, int k){
        int[] temp = new int[n];
        int count = 0;
        if (k >= 0) System.arraycopy(arr, 0, temp, 0, k);
        for(int i = k; i < n; i++){
            arr[count++] = arr[i];
        }
        int i =0;
        while(count < arr.length){
            arr[count++] = temp[i++];
        }
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        int k = sc.nextInt();
        rotateArray(arr, arr.length,k);
        printArray(arr, arr.length);
    }
}
