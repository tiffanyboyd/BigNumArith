package com.company; //comment out when you submit!!

import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class BigNumArith{

    public static void main(String[] args) {
        String filename = args[0];

        try{
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            String exp = sc.nextLine();
            PrintWriter pw = new PrintWriter("output.txt");
            AStack numStack = new AStack(exp.length());
            char zero = '0';

            for(int i = 0; i<exp.length(); i++){
                int count = 0;
                int [] numChars = new int[exp.length()];
                if(exp.charAt(i) == (zero)){
                    numChars[count] = (int)exp.charAt(i);
                    count++;
                    //pw.println(exp.charAt(i));
                    //numStack.push(exp.charAt(i));

                }
                for(int j = 0; j< numChars.length; j++){
                    pw.println(exp.charAt(j));
                }
                pw.close();
                //try {
                   // PrintWriter pw = new PrintWriter("output.txt");
                //pw.println(exp.charAt(i));
                    //loops through the 2d array and gets the int saved within variable to save to the new file.
                  /**  for (int i = 0; i < exp.length(); i++) {
                        for (int j = 0; j < width; j++){
                            pw.println();
                            pw.println();
                            pw.println();
                        }
                    }
                    pw.close();
                    //displays and error message and exits program if saving error.
                } catch (FileNotFoundException e) {
                    System.out.println("Something went wrong");
                    System.exit(-1);
                } */
            }


            //System.out.println(arith);
        }catch (FileNotFoundException e) {
            System.out.println("Error, file could not be found!");
            System.exit(-1);
        }
    }
}