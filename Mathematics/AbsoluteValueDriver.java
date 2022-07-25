
// import java.io.*;
import java.util.*;

class AbsoluteValueDriver {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Testcase");
        int T = scn.nextInt();
        while (T > 0) {
            System.out.println("Enter Input: ");
            int I = scn.nextInt();
            Solution _solution = new Solution();
            System.out.println(_solution.absolute(I));
            T--;
        }
        scn.close();

    }
}

class Solution {
    public int absolute(int I) {
        // code here
        if (I < 0) {
            I *= -1;
        }
        return I;
    }
}