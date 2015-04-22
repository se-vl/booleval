class And extends BinaryExpression
{
    public And(Expression x, Expression y)
    {
        super(x, y);
    }

    @Override
    public int precedence()
    {
        return 10;
    }

    @Override
    protected String operator()
    {
        return " && ";
    }
}
