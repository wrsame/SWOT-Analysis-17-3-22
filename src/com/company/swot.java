package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class swot {
  public void soutPrinter(String text) throws InterruptedException {

    for (int i = 0; i <= text.length() - 1; i++) {
      System.out.print(text.charAt(i));
      Thread.sleep(20);
    }
    System.out.println();
  }

  public void introduction() throws InterruptedException {
    // SWOT ANALYSIS Text

    soutPrinter("SWOT ANALYSIS");
    soutPrinter("A SWOT analysis is an incredibly simple, yet powerful tool to help you develop your business strategy, " +
        "whether you’re building a startup or guiding an existing company.");
    soutPrinter("SWOT stands for Strengths, Weaknesses, Opportunities, and Threats.");
  }


  public static void userInput(){
    Scanner in = new Scanner(System.in);
   // Strengths
    System.out.println("To do the analysis, you must answer the statements");
    System.out.println("\n\nSTRENGTHS");
    System.out.println("TYPE OUT 4 STRENGTH YOUR TEAM/COMPANY HAS");
    String sth1 = in.nextLine();
    String sth2 = in.nextLine();
    String sth3 = in.nextLine();
    String sth4 = in.nextLine();
   //Weakness
    System.out.println("WEAKNESS");
    System.out.println("TYPE OUT 4 WEAKNESS YOUR TEAM/COMPANY HAS");
    String wk1 = in.nextLine();
    String wk2 = in.nextLine();
    String wk3 = in.nextLine();
    String wk4 = in.nextLine();
   //Opportunities
    System.out.println("OPPORTUNITIES");
    System.out.println("TYPE OUT 4 OPPPORTUNTIES YOUR TEAM/COMPANY HAS");
    String op1 = in.nextLine();
    String op2 = in.nextLine();
    String op3 = in.nextLine();
    String op4 = in.nextLine();
    //Threads
    System.out.println("THREADS");
    System.out.println("TYPE OUT 4 THREADS YOUR TEAM/COMPANY HAS");
    String thr1 = in.nextLine();
    String thr2 = in.nextLine();
    String thr3 = in.nextLine();
    String thr4 = in.nextLine();

    //Print out the informations
    System.out.println("Results:");
    System.out.println("\n\nSTRENGTHS");
    System.out.printf("%s\n%s\n%s\n%s",sth1,sth2,sth3,sth4);
    System.out.println("\n\n\n\nWEAKNESS");
    System.out.printf("%s\n%s\n%s\n%s",wk1,wk2,wk3,wk4);
    System.out.println("\n\n\n\nOPPORTUNITES");
    System.out.printf("%s\n%s\n%s\n%s",op1,op2,op3,op4);
    System.out.println("\n\n\n\nTHREADS");
    System.out.printf("%s\n%s\n%s\n%s",op1,op2,op3,op4);








  }





}

