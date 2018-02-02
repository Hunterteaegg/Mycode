#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number[8];
    int i,n;

    printf("Enter 8 numbers: \n");
    for(i=0;i<=7;i++)
    {
        scanf("%d",&number[i]);
    }
    for(n=7;n>=0;n--)
    {
        printf("%d",number[n]);
    }

    return 0;
}
