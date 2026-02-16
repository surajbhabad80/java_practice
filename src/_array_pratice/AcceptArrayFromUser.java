package _array_pratice;

import java.util.Scanner;

public class AcceptArrayFromUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();

        int[] array=new int[n];
        System.out.println("Enter "+n +" element");

        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        for (int a:array){
            System.out.println(a);
        }

    }
}
