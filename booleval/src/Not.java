class Not implements Expression
{
    private final Expression _x;

    public Not(Expression x)
    {
        _x = x;
    }

    public Expression x()
    {
        return _x;
    }

    @Override
    public String infixForm()
    {
        return "!" + _x.infixFormSuitableFor(0);
    }

    @Override
    public int precedence()
    {
        return 0;
    }

    @Override
    public String infixFormSuitableFor(int surroundingPrecedence)
    {
        return infixForm();
    }
}
