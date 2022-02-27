package com.company; //comment out when you submit!!

import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class BigNumArithmetic {

    public static void main(String[] args) {
        String filename = args[0];
        String[] array = new String[100];

        try{
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            LinkedList numLink1 = new LinkedList();
            LinkedList numLink2 = new LinkedList();

            //while(sc.hasNextLine()){
                String data = sc.nextLine();
                data = data.trim().replaceAll("  +", " "); //gets rid of extra white space
                for(int i = 0; i<data.length(); i++){
                    if(data.charAt(0) == '0'){
                        data = data.replaceFirst("0", ""); //gets rid of leading zero beginning of string
                    }

                }
                Scanner num = new Scanner(data);
            String number = "";
                while(num.hasNextLine()){
                    number = num.next();
                    if((number.charAt(0) == '0') && (number.length()>1)){
                        number = number.replaceFirst("0", ""); //gets rid of leading zeros in each number


                        /**for(int i = 0; i < number.length(); i++){
                            if(number.charAt(i) != ' '){
                                numLink1.add(number.charAt(i));
                            }else{
                                numLink2.add(number.charAt(i+1));
                            }
                        }
                        numLink1.print();*/
                    }
                    //numLink1.strToLL(number);
                    //numLink1.print();
                    /**for(int i = 0; i < number.length(); i++) {
                        //numLink1.add(number.charAt(i));

                        if (number.charAt(i) == ' ') {
                            numLink2.add(number.charAt(i + 1));
                        }else{
                            numLink1.add(number.charAt(i));
                        }
                    }*/

                    //numLink1.print();


                    System.out.println(number);
                }
            //numLink1.print();
            //numLink2.print();

            //} //Bracket to close While loop.
        }catch (FileNotFoundException e) {
            System.out.println("Error, file could not be found!");
            System.exit(-1);
        }
    }
}

/**
 if(s1.equals("+") || s1.equals("-") || s1.equals("*") || s1.equals("/")){
 switch (s1){
 case '+':
 number1 = stack.pop();
 number2 = stack.pop();
 System.out.print(number1 + " + " + number2);
 break;
 case '*':
 number1 = stack.pop();
 number2 = stack.pop();
 System.out.print(number1 +" - "+ number2);
 break;
 case '^':
 number1 = stack.pop();
 number2 = stack.pop();
 System.out.print(number1 +" / "+ number2);
 break;
 }
 }else{
 stack.push(s1);
 }
 */