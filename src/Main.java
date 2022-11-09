import java.util.Scanner;

public class Main {
    public static double sum(double a, double b){
        return a+b;
    }
    public static double differ(double a, double b){
        return a-b;
    }
    public static double multipl(double a, double b){
        return a*b;
    }
    public static double div(double a, double b){
        return a/b;
    }
    public static double Calculator(double num1, double num2, char op){
        switch(op) {
            case '+': return sum(num1, num2); //Design Pattern Facade
            case '-': return differ(num1, num2); //DPF
            case '*': return multipl(num1, num2); //DPF
            case '/': return div(num1, num2); //DPF
            default:  System.out.println("Error! Enter correct operator");
                return -1.1111111111111;
        }
    }
    public static void main(String[] args) {
                double num1;
                double num2;
                char op;
                Scanner reader = new Scanner(System.in);
                System.out.print("Enter two numbers: ");
                num1 = reader.nextDouble();
                num2 = reader.nextDouble();
                System.out.print("\nEnter an operator (+, -, *, /): ");
                op = reader.next().charAt(0);
                double res = Calculator(num1, num2, op); //DPF
                System.out.println(num1 + " " + op + " " + num2 + " = " + res);
    }
}