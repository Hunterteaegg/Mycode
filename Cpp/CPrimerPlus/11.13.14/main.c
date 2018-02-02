#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc,char **argv)
{
    double a;
    int b;

    a=atof(argv[1]);
    b=atoi(argv[2]);
    printf("The answer is %lf",pow(a,b));

    return 0;
}
