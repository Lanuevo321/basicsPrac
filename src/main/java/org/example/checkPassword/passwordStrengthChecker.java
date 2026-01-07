package org.example.checkPassword;

import java.util.Scanner;

public class passwordStrengthChecker {

    public void passwordChecker(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");
        String pass = sc.nextLine();

        int score = 0;

        if (pass.length() >= 8){
            score++;
        }

        if (pass.matches(".*[A-Z]*.")){
            score++;
        }
        if (pass.matches(".*[a-z]*.")){
            score++;
        }

        if (pass.matches(".*[0-9]*.")){
            score++;
        }

        if (pass.matches(".*[!@#$^&*(){}:;?><.,/ ']*.")){
            score++;
        }



        if (score == 5 ){
            System.out.println("Password strength: STRONG");
        }else if (score == 3){
            System.out.println("Password strength: MEDUIM");
        }else {
            System.out.println("Password strength: WEAK");
        }

        sc.close();
    }
}
