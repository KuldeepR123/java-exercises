package com.example.kuldeep;
import java.util.InputMismatchException;
import java.util.Scanner;

class ParseIntegerException extends Exception{
    public String toString(){
        return "Invalid Elasticsearch port configuration";
    }
}
public class CustomException {
        static void check(String num) throws ParseIntegerException, InputMismatchException {
            if (Integer.parseInt(num) > 65000) {
                throw new ParseIntegerException();
            }
        }
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            String num;
            try{
                num = scan.nextLine();
                check(num);
            }
            catch(ParseIntegerException e){
                System.out.println(e);
            }
        }
}


