#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a = 333333333333333;
    float b = 2e20;
    float c=b+1;
    float d=b-1;

    printf("%d %f %f\n",a,c,d);
    return 0;
}
