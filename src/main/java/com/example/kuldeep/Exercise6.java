package com.example.kuldeep;
import java.util.*;

public class Exercise6 {
    static void multiplication(int[][] arry1, int[][] arry2){
        int[][] C = new int[3][3];
        for(int i=0;i<3; i++){
            for(int j=0; j<3; j++){
                C[i][j] = 0;
                for(int k=0; k<3; k++){
                    C[i][j] = C[i][j]+arry1[i][k]*arry2[k][j];
                }
            }
        }
        for(int v[]:C){
            for(int i:v){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
    static void subArray(int sub[]){
        for(int i=0; i< sub.length; i++){
            if(i>4 && i<9){
                System.out.print(sub[i]+" ");
            }
        }
        System.out.println("");
    }
    static void largestSmallest(int b[]){
        for(int i=0; i<b.length-1; i++){
            for(int j=0; j<b.length-i-1; j++){
                if(b[j]>b[j+1]){
                    b[j] = b[j]^b[j+1];
                    b[j+1] = b[j]^b[j+1];
                    b[j] = b[j]^b[j+1];
                }
            }
        }
        System.out.println("Second Largest Element" + " : " + b[48]);
        System.out.println("Third Smallest Element" + " : " + b[2]);
    }
    public static void main(String[] args){
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = {{1,2,3},{4,5,6},{7,8,9}};
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {57,6, 16, 54, 58, 2, 31, 14, 45, 80, 84, 75, 46, 87, 59, 49, 34, 43, 64, 51, 76, 70, 26, 62, 21, 81,
                74, 60, 27, 86, 77, 68, 37, 13, 78, 11, 52, 94, 3, 44, 85, 18, 25, 47, 63, 28, 97, 88, 92, 24};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scan.nextInt();
        int counter = 0;
        int previous = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++) {
                System.out.println(counter+1);
                counter+=1;
                previous =i;
            }
        }
        multiplication(A,B);
        subArray(a);
        largestSmallest(b);
    }
}
