public class Main {

    public static void main(String[] args) {

        // ============================================================
        // ERROR 1 — SYNTAX ERROR
        // Missing semicolon
        // ============================================================
        int number = 10


        // ============================================================
        // ERROR 2 — TYPE ERROR
        // String assigned to an integer
        // ============================================================
        int age = "twenty";


        // ============================================================
        // ERROR 3 — UNDEFINED VARIABLE
        // 'username' has never been declared
        // ============================================================
        System.out.println(username);


        // ============================================================
        // ERROR 4 — METHOD NOT FOUND
        // Java String does not contain a method called makeUpper()
        // ============================================================
        String name = "ACR_AGENT";
        System.out.println(name.makeUpper());


        // ============================================================
        // ERROR 5 — INCOMPATIBLE RETURN TYPE
        // getNumber() returns String but method expects int
        // ============================================================
        int result = getNumber();


        // ============================================================
        // ERROR 6 — ARRAY INDEX OUT OF BOUNDS
        // Array has indexes 0,1,2 but index 5 is accessed
        // ============================================================
        int[] numbers = {10, 20, 30};
        System.out.println(numbers[5]);


        // ============================================================
        // ERROR 7 — CLASS / SYMBOL NOT FOUND
        // ArrayList is used without importing java.util.ArrayList
        // ============================================================
        ArrayList<String> list = new ArrayList<>();
        list.add("ACR_AGENT");


        // ============================================================
        // ERROR 8 — DIVISION BY ZERO
        // Runtime error
        // ============================================================
        int x = 100;
        int y = 0;
        int division = x / y;

        System.out.println(division);


        // ============================================================
        // ERROR 9 — LOGICAL ERROR
        // Program compiles, but condition is incorrect
        // ============================================================
        int marks = 80;

        if (marks < 40) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }


        // ============================================================
        // ERROR 10 — NULL POINTER ERROR
        // Runtime NullPointerException
        // ============================================================
        String message = null;
        System.out.println(message.length());


        System.out.println("ACR_AGENT test completed.");
    }


    // ================================================================
    // ERROR 5 SUPPORTING METHOD
    // Method returns String instead of int
    // ================================================================
    public static String getNumber() {
        return "100";
    }
}
