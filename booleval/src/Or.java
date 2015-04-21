class Or implements Expression
{
    private final Expression _x;
    private final Expression _y;

    public Or(Expression x, Expression y)
    {
        if (x instanceof A || x instanceof B || x instanceof Klammern
                || x instanceof Or)
        {
            _x = x;
        }
        else
        {
            _x = new Klammern(x);
        }
        if (x instanceof A || x instanceof B || x instanceof Klammern
                || x instanceof Or)
        {
            _y = y;
        }
        else
        {
            _y = new Klammern(y);
        }
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
        return _x.infixForm() + " || " + _y.infixForm();
    }
}
