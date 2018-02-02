#include <stdio.h>
#include <stdlib.h>

void list(double * target)
{
    int i;

    for(i=4;i>=0;i--)
    {
        printf("%lf ",target[i]);
    }
}

int main()
{
    double num[5]={1.1,2.2,3.3,4.4,5.5};

    list(num);

    return 0;
}
