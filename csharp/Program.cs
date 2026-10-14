using System;

namespace ACRAgentFixture;

public static class Program
{
    public static void Main()
    {
        int typeError = "not an integer";       // 1: incompatible type
        int missingSymbol = missingCSharpSymbol; // 2: unknown symbol
        MissingCSharpMethod();                   // 3: unknown method
        string wrongType = 42;                   // 4: incompatible type
        int missingExpression = ;                // 5: missing expression
        Console.WriteLine(typeError + missingSymbol + wrongType + missingExpression);
    }
}
