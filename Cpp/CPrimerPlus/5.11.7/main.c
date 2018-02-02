#include <stdio.h>
#include <stdlib.h>
double cube(double n);

int main()
{
    double n;

    printf("Enter a number to cube:");
    scanf("%lf",&n);
    cube(n);

    return 0;
}

double cube(double n)
{
    double cube;

    cube=n*n*n;
    printf("%lf",cube);
}

