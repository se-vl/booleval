class B implements Expression
{
    @Override
    public String infixForm()
    {
        return "b";
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
