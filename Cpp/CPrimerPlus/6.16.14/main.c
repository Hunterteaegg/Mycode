#include <stdio.h>
#include <stdlib.h>

int main()
{
    double num1[8],num2[8];
    int i,m,n,sum=0;

    printf("Enter 8 numbers:\n");
    for(i=1;i<=8;i++)
    {
        scanf("%lf",&num1[i]);
        sum=sum+num1[i];
        num2[i]=sum;
    }
    for(m=1;m<=8;m++)
    {
        printf("%5.2lf   ",num1[m]);
    }
    printf("\n");
    for(n=1;n<=8;n++)
    {
        printf("%5.2 lf   ",num2[n]);
    }

    return 0;
}
