#include <stdio.h>
#include <stdlib.h>

void list(double x,double y,double z);
void intercharge(double * a,double * b);

int main()
{
    double x,y,z;

    printf("Enter three numbers:");
    scanf("%lf %lf %lf",&x,&y,&z);
    list(x,y,z);

    return 0;
}

void list(double x,double y,double z)
{
    if(x>y)
    {
        intercharge(&x,&y);
    }
    if(y>z)
    {
        intercharge(&y,&z);
    }
    printf("%lf %lf %lf",x,y,z);
}

void intercharge(double * a,double * b)
{
    double temp;

    temp=*a;
    *a=*b;
    *b=temp;
}
