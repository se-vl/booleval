class Klammern implements Expression
{
    private Expression _x;

    public Klammern(Expression x)
    {
        _x = x;
    }

    @Override
    public String infixForm()
    {
        return "(" + _x.infixForm() + ")";
    }
}
