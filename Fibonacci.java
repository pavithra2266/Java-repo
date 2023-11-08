package FullStack;

import java.util.Scanner;

public class Fibbonacci {
public static void main(String args[]) {
 Scanner fibo=new Scanner(System.in);
 System.out.println("Enter the num");
 int n=fibo.nextInt();
 int a=0;
 
 int b=1;
 int c;
// System.out.println(a+"\n"+b);
 int i;
 for(i=0;i<n;i++) {
 c=a+b;
 a=b;
 b=c;
 System.out.println(+c);
 
 }
}
}
