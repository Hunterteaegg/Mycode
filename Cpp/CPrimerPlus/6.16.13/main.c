#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int i,n;
    int num[8];

    for(i=0;i<=8;i++)
    {
        num[i]=pow(2,i);
    }
    i=0;
    do
    {
        printf("%d ",num[i]);
        i++;
    }while(i<=8);
    return 0;
}
