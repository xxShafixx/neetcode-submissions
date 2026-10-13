class Solution {
    private boolean matches(char open, char close) {
    return (open == '(' && close == ')')
            || (open == '[' && close == ']')
            || (open == '{' && close == '}');
}
    
    public boolean isValid(String s) {
        Deque <Character> stack = new ArrayDeque<>();

        for (int i=0 ; i<s.length() ; i++) {
            char bracket = s.charAt(i);

            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char prevOpenBracket = stack.pop();
                if (!matches(prevOpenBracket, bracket)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
