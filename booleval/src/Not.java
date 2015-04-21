class Not implements Expression
{
    private final Expression _x;

    public Not(Expression x)
    {
        if (x instanceof A || x instanceof B || x instanceof Klammern
                || x instanceof Not)
        {
            _x = x;
        }
        else
        {
            _x = new Klammern(x);
        }
    }

    public Expression x()
    {
        return _x;
    }

    @Override
    public String infixForm()
    {
        return "!" + _x.infixForm();
    }
}
