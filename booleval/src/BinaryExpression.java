abstract class BinaryExpression implements Expression
{
    private final Expression _x;
    private final Expression _y;

    public BinaryExpression(Expression x, Expression y)
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
        return _x.infixFormSuitableFor(precedence()) + operator()
                + _y.infixFormSuitableFor(precedence());
    }

    protected abstract String operator();

    @Override
    public String infixFormSuitableFor(int surroundingPrecedence)
    {
        if (surroundingPrecedence < precedence())
        {
            return "(" + infixForm() + ")";
        }
        else
        {
            return infixForm();
        }
    }
}
