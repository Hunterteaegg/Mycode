#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double power(double a,double b);

int main()
{
    double a,b;

    printf("Enter two number:");
    scanf("%lf %lf",&a,&b);
    printf("The answer is %lf",power(a,b));

    return 0;
}

double power(double a,double b)
{
    if(a==0&&b==0)
    {
        return 1;
    }
    else if(b<0)
    {
        return 1/pow(a,-b);
    }
    else
    {
        return pow(a,b);
    }
}
