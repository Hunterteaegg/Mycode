#include <stdio.h>
#include <stdlib.h>

void Fibonacci(void)
{
    int num[20];
    num[0]=1;
    num[1]=1;
    int i=1;

    printf("%d %d ",num[0],num[1]);
    for(i=2;i<=19;i++)
    {
        num[i]=num[i-1]+num[i-2];
        printf("%d ",num[i]);
    }
}

int main()
{
    Fibonacci();

    return 0;
}
