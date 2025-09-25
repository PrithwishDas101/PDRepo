import java.util.Stack;

class CheckParenthesis 
{
    @SuppressWarnings("rawtypes")
    public static boolean isValid(String s) 
    {
        @SuppressWarnings("unchecked")
        Stack<Character> stack = new Stack();

        for (char ch : s.toCharArray())
        {
            if (ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }

            else
            {
                if (stack.isEmpty())
                {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '['))
                {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) 
    {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("([)]"));
    }
}