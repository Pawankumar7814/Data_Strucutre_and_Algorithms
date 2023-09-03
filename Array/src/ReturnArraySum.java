//Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
//        Input Format :
//        The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//        The first line of each test case or query contains an integer 'N' representing the size of the array/list.
//
//        Second line contains 'N' single space separated integers representing the elements in the array/list.
//        Output Format :
//        For each test case, print the sum of the numbers in the array/list.
//
//        Output for every test case will be printed in a separate line.
//        Constraints :
//        1 <= t <= 10^2
//        0 <= N <= 10^5
//
//        Time Limit: 1sec
//        Sample Input 1:
//        1
//        3
//        9 8 9
//        Sample Output 1:
//        26
//        Sample Input 2:
//        2
//        5
//        1 2 3 4 5
//        3
//        10 20 30
//        Sample Output 2:
//        15
//        60

import java.util.Scanner;

public class ReturnArraySum {
    public static Scanner sc = new Scanner(System.in);

    // To take input from the user
    public static int[] takeInput(){
        int n = sc.nextInt(); // Take the size of array from the user
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // To find the sum of element of an array
    public static int sum(int[] arr, int n){
        if(n == 0){
            return -1;
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += arr[i];
        }
        return ans;
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = takeInput();
        int ans = sum(arr, arr.length);
        System.out.println(ans);
    }
}
