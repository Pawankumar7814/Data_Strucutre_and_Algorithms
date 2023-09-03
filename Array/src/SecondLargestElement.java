//Input:
//N : 5
//arr : 10 112 11 345 12

// Output: 112

import java.util.Scanner;

public class SecondLargestElement {
    public static Scanner sc = new Scanner(System.in);

    public static int[] takeInput(){
        int n = sc.nextInt(); // take input from the use for the size of array
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // To find the largest element in the array
    public static int largestElement(int[] arr, int n){
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n;i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    // To find the second largest element in the array
    public static int findSecondLargestElement(int[] arr, int n){
        int largestNumber = largestElement(arr,n);
        int secondlargestNumber = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] < largestNumber && arr[i] > secondlargestNumber){
                secondlargestNumber = arr[i];
            }
        }
        if(secondlargestNumber == Integer.MIN_VALUE){
            return -1;
        }
        return secondlargestNumber;
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = takeInput();
        int secondLargestElement = findSecondLargestElement(arr, arr.length);
        System.out.println(secondLargestElement);
    }
}