class Not implements Expression
{
    private final Expression _x;

    public Not(Expression x)
    {
        _x = x;
    }

    public Expression x()
    {
        return _x;
    }

    @Override
    public String infixForm()
    {
    	if(_x instanceof A || _x instanceof B)
    	{
    		return "!" + _x.infixForm();
    	}
        return "!(" + _x.infixForm() + ")";
    }
}
