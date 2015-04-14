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
}
