public class Main {
    public static void main(String[] args) {
        int typeError = "not an integer";       // 1: incompatible type
        int missingSymbol = missingJavaSymbol;   // 2: unknown symbol
        acceptNumber("not a number");            // 3: wrong argument type
        String wrongType = 42;                   // 4: incompatible type
        int missingSemicolon = 5                 // 5: missing semicolon
        System.out.println(typeError + missingSymbol + wrongType + missingSemicolon);
    }

    static void acceptNumber(int value) {
        System.out.println(value);
    }
}
