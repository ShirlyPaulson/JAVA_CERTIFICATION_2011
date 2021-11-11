package Shirly.JavaPrograms;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
          int number1 = 0;
          int number2 = 0;
          char operator;

    Scanner sc  = new Scanner(System.in);
    System.out.print("Please enter the first number: ");
    number1 = sc.nextInt();

    System.out.print("Please enter the Second number: ");
    number2 = sc.nextInt();

    System.out.print("Please enter the  Operand (+, -, *, /):  ");
    operator = sc.next().charAt(0);

    if(operator== '+'|| operator == '-' || operator== '*' || operator == '/'){
        int result = calculate(number1,number2,operator);
        System.out.println("number1 " +operator+ " number2 = "+ result);

        }
    else{
        System.out.println("Please choose the operator(+,-,*,/) ");

    }
        sc.close();

    }

    static int calculate(int x, int y, char op){
        int res =0;
        switch(op)
        {
            case '+':
                res = x + y;
                break;
            case '-':
                res = x-y;
                break;
            case '*':
                res = x*y;
                break;
            case '/':
                try {
                    res = x / y;
                }
                catch (ArithmeticException e){
                    e.printStackTrace();

            }

                break;
        }
        return res;
    }
}
