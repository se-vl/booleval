import static org.junit.Assert.*;

import org.junit.Test;

public class ParenthesesTest
{
    private Parser _parser = new Parser();

    private String infix(String postfix)
    {
        Expression expression = _parser.parse(postfix);
        return expression.infixForm();
    }

    @Test
    public void testVariables()
    {
        assertEquals("a", infix("a"));
        assertEquals("b", infix("b"));
    }

    @Test
    public void testNotOnce()
    {
        assertEquals("!a", infix("a!"));
    }

    @Test
    public void testNotTwice()
    {
        assertEquals("!!a", infix("a!!"));
    }

    @Test
    public void testAnd()
    {
        assertEquals("a && b", infix("ab&"));
    }

    @Test
    public void testOr()
    {
        assertEquals("a || b", infix("ab|"));
    }

    @Test
    public void testNotAnd()
    {
        assertEquals("!(a && b)", infix("ab&!"));
    }

    @Test
    public void testNotOr()
    {
        assertEquals("!(a || b)", infix("ab|!"));
    }

    @Test
    public void testExclusiveOr1()
    {
        assertEquals("a && !b || !a && b", infix("ab!&a!b&|"));
    }

    @Test
    public void testExclusiveOr2()
    {
        assertEquals("(a || b) && !(a && b)", infix("ab|ab&!&"));
    }
}
