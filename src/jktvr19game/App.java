/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public void run() {
        System.out.println("Hi! Are you ready?");
        Random random = new Random();
        int myNumber = random.nextInt(5-0+1)+0;
        System.out.println("Guess the number ");
        Scanner scanner = new Scanner(System.in);
        String gamerNumberStr = null;
        int gamerNumber = -1;
        int attempt =2;
        do {
            try {
                gamerNumberStr = scanner.nextLine();
                gamerNumber = Integer.parseInt(gamerNumberStr);
            } catch (Exception e) {
                System.out.println("Not right enter! Start over");
                System.exit(0);
            }
            if(myNumber == gamerNumber) {
                System.out.println("Win!");
                break;
            }else{
                if(attempt > 0){
                    System.out.println("Not right! I have still " + attempt + " times");
                }else{
                    System.out.println("Fall!");
                    System.out.println("Right is "+ myNumber);
                    break;
                }
                attempt-- ;
            }
        } while (true);
        System.out.println("-- Game over --");
    }
}
