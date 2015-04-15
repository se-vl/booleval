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
        return "(" + _x.infixForm() + " && " + _y.infixForm() + ")";
    }
}
