#include <stdio.h>
#include <stdlib.h>

int main()
{
    float inch;
    float cm;

    printf("Enter your height in inch:");
    scanf("%f",&inch);
    cm=inch/2.54;
    printf("Your height in cm is:%f",cm);

    return 0;
}
