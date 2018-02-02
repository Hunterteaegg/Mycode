#include <stdio.h>
#include <stdlib.h>

#define NUM 100

double transform(double *source,double *target,int num,double (*sin)(double pt));
double sin(double pt);

int main()
{
    double source[NUM];
    double target[NUM];

    for(int i=0;i<NUM;i++)
    {
        source[i]=0;
    }
    transform(source,target,NUM,sin);

    return 0;
}

double transform(double *source,double *target,int num,double (*sin)(double pt))
{
    for(int i=0;i<NUM;i++)
    {
        target[i]=(*sin)(source[i]);
    }

    return 0;
}

double sin(double pt)
{
    return pt+1;
}
