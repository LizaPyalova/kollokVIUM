import java.util.Scanner;



public class Main {
    public static double Calculator(double num1, double num2, char op){
        switch(op) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            default:  System.out.printf("Error! Enter correct operator");
                return -1.0;
        }
    }
    public static void main(String[] args) {
                double num1;
                double num2;
                double ans;
                char op;
                Scanner reader = new Scanner(System.in);
                System.out.print("Enter two numbers: ");
                num1 = reader.nextDouble();
                num2 = reader.nextDouble();
                System.out.print("\nEnter an operator (+, -, *, /): ");
                op = reader.next().charAt(0);
                System.out.printf(num1 + " " + op + " " + num2 + " = " + Calculator(num1, num2, op));
    }
}