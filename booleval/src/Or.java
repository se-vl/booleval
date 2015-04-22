class Or extends BinaryExpression
{
    public Or(Expression x, Expression y)
    {
        super(x, y);
    }

    @Override
    public int precedence()
    {
        return 20;
    }

    @Override
    protected String operator()
    {
        return " || ";
    }
}
