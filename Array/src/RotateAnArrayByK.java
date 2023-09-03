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
    public static int[] rotateArray(int[] arr, int n){
        int[] temp = new int[n];
        for(int i = 0; i < n; i++){
            temp[i] = arr[n-i-1];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
         arr = rotateArray(arr, arr.length);
          printArray(arr, arr.length);


    }
}
