#include <stdio.h>
#include <stdlib.h>

int main()
{
    int top_limit,bottom_limit,i,square,cube;

    printf("Enter bottom and top limit:");
    scanf("%d %d",&bottom_limit,&top_limit);
    printf("number   square   cube\n");
    for(i=bottom_limit;i<=top_limit;i++)
    {
        square=i*i;
        cube=i*i*i;
        printf("%5d   %6d   %4d\n",i,square,cube);
    }

    return 0;
}
