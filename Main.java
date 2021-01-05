package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }

    }
}
