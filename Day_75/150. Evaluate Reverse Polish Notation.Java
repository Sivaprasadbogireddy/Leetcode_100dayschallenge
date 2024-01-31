import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            if (isOperator(s)) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(performOperation(a, b, s));
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
    }

    private boolean isOperator(String s) {
        return s.length() == 1 && "+-*/".contains(s);
    }

    private int performOperation(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
