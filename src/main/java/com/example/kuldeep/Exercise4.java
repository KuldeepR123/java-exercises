package com.example.kuldeep;
import java.util.*;
public class Exercise4 {
    static void printRowColumn(){

    }
    static void printDiagonal(int n){
        System.out.println("Print Diagonal");
        for(int i=1;i<=n;i++){
            int m=i;
            for(int j=1;j<=n;j++){
                if(i==j) {
                    System.out.print(m + " ");
                    m+=n;
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            int m = i;
            for(int j=1;j<=n;j++){
                if((n-i+1)==j){
                    System.out.print(m + " ");
                    m+=n;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Enter number : ");
        n = s.nextInt();
        if(n!=1 && n%2 != 0){
            for(int i=1; i<=n; i++){
                int m=i;
                for(int j=1; j<=n; j++){
                    System.out.print(m + " ");
                    m+=n;
                }
                System.out.println();
            }
            for(int i=1;i<=n;i++){
                int m=i;
                for(int j=1;j<=n;j++){
                    if(i==j) {
                        System.out.print(m + " ");
                        m+=n;
                    }
                }
                System.out.println();
            }
            for(int i=1;i<=n;i++){
                int m = i;
                for(int j=1;j<=n;j++){
                    if((n-i+1)==j){
                        System.out.print(m + " ");
                        m+=n;
                    }
                }
            }
        }
        else{
            System.out.println("Enter only odd number !");
        }
//        printDiagonal(n);
    }
}
