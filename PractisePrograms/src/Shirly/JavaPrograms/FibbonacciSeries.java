package Shirly.JavaPrograms;

import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count for fibonacci series ");
        int number = sc.nextInt();
        FibbonacciSeries fobj = new FibbonacciSeries();
        fobj.Fibonacci(number);

        sc.close();
    }

    public void Fibonacci(int number) {
        int x=1;
        int y =0;
        int z= 0;
        int count=0;
        while(count<number) {
            System.out.print(z+ " ");
            z = x + y;
            x = y;
            y = z;

            count++;
        }

    }
}
