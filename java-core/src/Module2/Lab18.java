package Module2;

/**
 * Created by Artem on 28.11.2015.
 */
public class Lab18 {
    public static void main(String[] args) {
        System.out.println(eval("123"));
        System.out.println(eval("2*3"));
        System.out.println(eval("(1+3)*2"));
        System.out.println(eval("((13/6)*2-5)+1"));

    }

    public static int eval(String expr) {
        return eval(expr, 0, expr.length());
    }

    private static int eval(String expr, int to, int from) {
        if (expr.charAt(from-1) == ')') {
            return eval(expr, to + 1, from - 1);
        } else {
            int pos = from-1;
            while (pos > to) {
                if (Character.isDigit(expr.charAt(pos))) {
                    pos--;
                } else {
                    int rightOperand = Integer.valueOf(expr.substring(pos+1, from));
                    char operation = expr.charAt(pos);
                    int leftOperand = eval(expr, to, pos);
                    switch (operation) {
                        case '+':
                            return leftOperand + rightOperand;
                        case '-':
                            return leftOperand - rightOperand;
                        case '*':
                            return leftOperand * rightOperand;
                        case '/':
                            return leftOperand / rightOperand;
                    }
                }
            }

            return Integer.valueOf(expr.substring(to, from));
        }
    }
}
