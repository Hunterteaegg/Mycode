#include <stdio.h>
#include <stdlib.h>

int main()
{
    float quart;
    float number;

    printf("Enter your mass:");
    scanf("%f",&quart);
    number=quart/3e-23;
    printf("The water atoms number is %f\n",number);

    return 0;
}
