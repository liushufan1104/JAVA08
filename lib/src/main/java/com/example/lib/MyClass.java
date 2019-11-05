package com.example.lib;
import java.util.Scanner;
public class MyClass {
    public static void main ( String[] args ) {
        int c=0,N=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number'n' ");
        N = scanner.nextInt();
        for(int i=1;i<=N;i++){
            int m=0;
            for (int j=1;j<=i;j++){
                if((i%j)==0)
                    m++;
                if (m>2)
                    break;
            }
            if(m==2){
                System.out.print(" "+i+" ");
                c++;
                if(c==5){
                    c=0;
                    System.out.println("");
                }
            }
        }
        System.out.println("is all Prime number");
    }
}