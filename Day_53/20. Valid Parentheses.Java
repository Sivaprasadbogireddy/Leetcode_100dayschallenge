import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false; // Closing parenthesis with no matching open parenthesis
                }

                char top = stack.pop();

                // Check if the closing parenthesis matches the corresponding open parenthesis
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Check if there are any remaining open parentheses in the stack
        return stack.isEmpty();
    }
}
