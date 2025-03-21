
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to check for prime numbers:");
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int count = 0;
        for(int i = 1 ; i<=num ; i++){
            if(num%i == 0 ){
                count++;
            }
        }
        if(count>2){
            System.out.println(num+"Is not a prime number");
        }
        else{
            System.out.println(num +" "+"Is a prime number ");
        }
    }
}