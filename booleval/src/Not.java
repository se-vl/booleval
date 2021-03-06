class Not extends SimpleExpression
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
}
