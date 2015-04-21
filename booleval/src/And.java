class And implements Expression
{
    private final Expression _x;
    private final Expression _y;

    public And(Expression x, Expression y)
    {
        _x = x;
        _y = y;
    }

    public Expression x()
    {
        return _x;
    }

    public Expression y()
    {
        return _y;
    }

    @Override
    public String infixForm()
    {
        return _x.infixFormSuitableFor(10) + " && " + _y.infixFormSuitableFor(10);
    }

    @Override
    public int precedence()
    {
        return 10;
    }

    @Override
    public String infixFormSuitableFor(int surroundingPrecedence)
    {
        if (surroundingPrecedence < 10)
        {
            return "(" + infixForm() + ")";
        }
        else
        {
            return infixForm();
        }
    }
}
