package org.example.distanceProblem;
import java.util.Scanner;

public class mainCode {
    public void iNterface(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\nGet travel time using speed & distance!!\n");
        System.out.println("~]$ what is the  distance of the location?");
        String dis1 = sc.nextLine();
        int dis = Integer.parseInt(dis1.replaceAll("[^0-9]", ""));

        System.out.println("~]$ how much speed do you want?");
        String speed1 = sc.nextLine();
        double speed = Double.parseDouble(speed1.replaceAll("[^0-9.]",""));

        double res = dis / speed;
        int h = (int) res;


        double m = 0.99;
        int sec = 60;

        if (res <= m){
            double res2 = res * sec;
            int t = (int) res2;

            System.out.println("Its "+t+" minutes to get in that location");

        }

        if(m < res) {
            double ch = res % 1;
            double mul = ch * sec;
            int y = (int) mul;

            System.out.println("Its "+h+ " hours & " + y +" minute(s)" +" to get in that location");
        }else {
            System.out.println("Its "+h+ " hour to get in that location");
        }




    }


}
