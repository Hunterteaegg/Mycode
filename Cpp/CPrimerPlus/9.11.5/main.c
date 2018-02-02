#include <stdio.h>
#include <stdlib.h>

void larger_of(double x,double y)
{
    if(x>y)
    {
        y=x;
    }
    if(y>x)
    {
        x=y;
    }
    printf("x=%lf y=%lf",x,y);
}

int main()
{
    double x,y;
    printf("Enter two numbers:");
    scanf("%lf %lf",&x,&y);
    larger_of(x,y);

    return 0;
}
