abstract class SimpleExpression implements Expression
{
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
