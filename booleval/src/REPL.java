import java.util.Scanner;

class REPL
{
    private final Scanner _scanner;
    private String _line;
    private final Parser _parser;

    public REPL()
    {
        _scanner = new Scanner(System.in);
        _parser = new Parser();
    }

    public void start()
    {
        printWelcomeMessage();
        readLine();
        while (!_line.isEmpty())
        {
            processLine();
            System.out.println();
            readLine();
        }
    }

    private void printWelcomeMessage()
    {
        System.out.println("Enter boolean postfix formulae containing the variables a and b.");
        System.out.println();
        System.out.println("Just pressing enter exits the program. Have fun!");
        System.out.println();
    }

    private void readLine()
    {
        System.out.print("$ ");
        _line = _scanner.nextLine();
    }

    private void processLine()
    {
        Expression expression = _parser.parse(_line);
        System.out.println(infixForm(expression));
    }

    private String infixForm(Expression expression)
    {
        if (expression instanceof A)
        {
            return "a";
        }
        else if (expression instanceof B)
        {
            return "b";
        }
        else if (expression instanceof Not)
        {
            Not not = (Not) expression;
            return "!" + infixForm(not.x());
        }
        else if (expression instanceof And)
        {
            And and = (And) expression;
            return infixForm(and.x()) + " && " + infixForm(and.y());
        }
        else if (expression instanceof Or)
        {
            Or or = (Or) expression;
            return infixForm(or.x()) + " || " + infixForm(or.y());
        }
        return "?";
    }
}
