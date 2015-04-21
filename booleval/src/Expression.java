interface Expression
{
    /**
     * Returns the expression in human-readable infix form.
     * For example, {@code new And(new A(), new Not(new B())).infixForm()} returns {@code "a && !b"}.
     */
    public String infixForm();

    /**
     * Every expression has a precedence, depending on its operator.
     * The highest precedence is 0. Greater values denote lower precedence.
     */
    public int precedence();

    /**
     * Returns the same string as the method {@link #infixForm},
     * except that the result is wrapped in parentheses
     * if the {@code surroundingPrecedence} implies their necessity.
     */
    public String infixFormSuitableFor(int surroundingPrecedence);
}
