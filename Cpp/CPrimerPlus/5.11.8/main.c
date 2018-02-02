#include <stdio.h>
#include <stdlib.h>

float Temperature(double temp);

int main()
{
    double F;
    int rv=1;

    while(rv==1)
    {
        printf("Enter temperature in F:");
        rv=scanf("%lf",&F);
        Temperature(F);
    }

    return 0;
}

float Temperature(double temp)
{
    double C,K;
    const double Kalvin=273.16;

    C=5.0/9.0*(temp-32.0);
    K=C+Kalvin;
    printf("%.2lf C, %.2lf K \n",C,K);
}
