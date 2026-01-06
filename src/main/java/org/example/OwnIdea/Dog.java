package org.example.OwnIdea;

import java.util.Scanner;

class kakayahan{
    char forward = 'w';
    char jump = 'j';
    char sideLeft = 'a';
    char sideRight = 'd';
    char backward = 's';

    kakayahan(char forward, char jump, char sideLeft, char sideRight, char backward){
        this.forward = forward;
        this.jump = jump;
        this.sideLeft = sideLeft;
        this.sideRight = sideRight;
        this.backward = backward;
    }
}


public class Dog {
    static Scanner sc = new Scanner(System.in);


    public static void dOg(){
        char keys;

        do{
            System.out.print("Enter key (w, j, a, d, s, e): ");
            keys = sc.next().charAt(0);


            switch (keys){
                case 'w':
                    fOrward();
                    break;

                case 'j':
                    jUmp();
                    break;

                case 'a':
                    SideLeft();
                    break;

                case 'd':
                    SideRight();
                    break;

                case 's':
                    BackWard();
                    break;

                case 'e':
                    break;

                default:
                    System.out.println("System error");
            }

        }while(keys != 'e');
    }


    static void fOrward(){
        System.out.println("The dog is walking");
    }
    static void jUmp(){
        System.out.println("The dog is Jumping");
    }
    static void SideLeft(){
        System.out.println("The dog side to left");
    }
    static void SideRight(){
        System.out.println("The dog side to right");
    }
    static void BackWard(){
        System.out.println("The dog backwars");
    }



}



