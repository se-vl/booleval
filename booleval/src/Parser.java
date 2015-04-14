import java.util.Stack;

class Parser
{
    private Stack<Expression> _stack;

    /**
     * Parses a boolean expression in postfix notation.
     * For example, parse("ab!&a!b&|") returns an Expression for exclusive-or.
     */
    public Expression parse(String input)
    {
        _stack = new Stack<>();
        for (char ch : input.toCharArray())
        {
            switch (ch)
            {
            case 'a':
                _stack.push(new A());
                break;

            case 'b':
                _stack.push(new B());
                break;

            case '!':
                not();
                break;

            case '&':
                and();
                break;

            case '|':
                or();
                break;
            }
        }
        return _stack.pop();
    }

    private void not()
    {
        Expression x = _stack.pop();
        _stack.push(new Not(x));
    }

    private void and()
    {
        Expression y = _stack.pop();
        Expression x = _stack.pop();
        _stack.push(new And(x, y));
    }

    private void or()
    {
        Expression y = _stack.pop();
        Expression x = _stack.pop();
        _stack.push(new Or(x, y));
    }
}
