#include <stdio.h>
#include <stdlib.h>
#include <float.h>

int main()
{
    double num1=1.0/3.0;
    float num2=1.0/3.0;

    printf("%.6f %.6f\n",num1,num2);
    printf("%.12f %.12f\n",num1,num2);
    printf("%.16f %.16f\n",num1,num2);
    printf("%d %d",DBL_DIG,FLT_DIG);

    return 0;
}
