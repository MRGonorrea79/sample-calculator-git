package ec.epn.edu.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        int addition = c.addition(4,7);
        System.out.println(addition);

        int subtraction = c.subtraction(4,7);
        System.out.println(subtraction);

        System.out.println("== Un cambio jijijiji ==");
    }
}
