#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int transform(char *pb);

int main()
{
    char *pbin="01001001";

    printf("%d",transform(pbin));

    return 0;
}

int transform(char *pb)
{
    int value=0;
    int n=7;

    for(int i=0;i<=7;i++,n--)
    {
        value+=(pb[n]-'0')*pow(2,i);
    }

    return value;
}
