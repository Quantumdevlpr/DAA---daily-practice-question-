import java.util.Scanner;

public class Leetcode70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs: ");
        int n = sc.nextInt();
        System.out.println("Number of ways to climb " + n + " stairs: " + climbStairs(n));
    }
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int a = 1;
        int b = 2;
        for(int i  = 3; i<= n; i++){
            int sum = a + b;
            a = b;
            b =sum;
        }
        return b;
    }
}