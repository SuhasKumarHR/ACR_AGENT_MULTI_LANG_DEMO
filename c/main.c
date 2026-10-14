#include <stdio.h>

/* The five intentional diagnostics live in this one file. */
int main(void) {
    int type_error = "not an integer";       /* 1: incompatible initializer */
    int missing_symbol = missing_c_symbol;    /* 2: undeclared identifier */
    int duplicate = 1;
    int duplicate = 2;                       /* 3: duplicate definition */
    int value = ;                             /* 4: missing expression */
    return missing_c_function(value);        /* 5: missing function */
}
