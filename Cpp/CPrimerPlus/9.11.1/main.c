#include <stdio.h>
#include <stdlib.h>

double min(double x,double y);

int main()
{
    double x,y;

    printf("Enter two number:");
    scanf("%lf %lf",&x,&y);
    printf("The lesser number is %lf\n",min(x,y));

    return 0;
}

double min(double x,double y)
{
    if(x>y)
    {
        return y;
    }
    else
    {
        return x;
    }
}
