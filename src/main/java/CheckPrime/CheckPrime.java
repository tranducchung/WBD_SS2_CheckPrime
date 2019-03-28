package CheckPrime;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want check ");
        number = scanner.nextInt();
        boolean check = true;

        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i == 0){
                check = false;
            }
            if(number<=2){
                check = false;
            }
        }
        if (check){
            System.out.println("Number "+ number + " is prime");
        }else {
            System.out.println("Number "+ number + " not is prime");
        }
    }
}
