```c
#include <stdio.h>

// Error 1: Missing semicolon
void syntax_error(void) {
    printf("Testing syntax error\n")
}

// Error 2: Undefined function implementation
int calculate_sum(int a, int b);

// Error 3: Incorrect data type
void type_error(void) {
    int number = "hello";
    printf("%d\n", number);
}

// Error 4: Missing return value
int get_value(void) {
    printf("Testing return error\n");
}

// Error 5: Array out-of-bounds access
void array_error(void) {
    int arr[3] = {10, 20, 30};

    for (int i = 0; i <= 3; i++) {
        printf("%d\n", arr[i]);
    }
}

// Error 6: Incorrect function usage / linker error
void linker_error(void) {
    printf("Sum = %d\n", calculate_sum(10, 20));
}

int main(void) {
    syntax_error();
    type_error();
    printf("Value = %d\n", get_value());
    array_error();
    linker_error();

    return 0;
}
```
