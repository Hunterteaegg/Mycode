#include <stdio.h>
#include <stdlib.h>

double add_average(double a,double b);

int main()
{
    double a,b;

    printf("Enter two numbers:");
    scanf("%lf %lf",&a,&b);
    printf("The answer is %lf",add_average(a,b));

    return 0;
}

double add_average(double a,double b)
{
    return 1/(((1/a)+(1/b))/2);
}
