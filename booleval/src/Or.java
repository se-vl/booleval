class Or implements Expression
{
    private final Expression _x;
    private final Expression _y;

    public Or(Expression x, Expression y)
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
        return _x.infixFormSuitableFor(20) + " || " + _y.infixFormSuitableFor(20);
    }

    @Override
    public int precedence()
    {
        return 20;
    }

    @Override
    public String infixFormSuitableFor(int surroundingPrecedence)
    {
        if (surroundingPrecedence < 20)
        {
            return "(" + infixForm() + ")";
        }
        else
        {
            return infixForm();
        }
    }
}
