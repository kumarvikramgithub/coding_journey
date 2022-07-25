package Array;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while (T > 0) {
            int n = scn.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            for (int i = 0; i < n / 2; i++) {
                arr[i] = arr[i] + arr[n - i - 1];
                arr[n - i - 1] = arr[i] - arr[n - i - 1];
                arr[i] = arr[i] - arr[n - i - 1];
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            T--;
        }
        scn.close();
    }
}