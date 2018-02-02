#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int open(int num);

int main()
{
    int num;

    printf("Enter a number:");
    scanf("%d",&num);
    printf("The open bit is %d",open(num));

    return 0;
}

int open(int num)
{
    int total=0;
    int size=CHAR_BIT*sizeof(int);

    for(int i=size;i>=0;i--,num>>=1)
    {
        if((01&num)==01)
        {
            total++;
        }
    }

    return total;
}
