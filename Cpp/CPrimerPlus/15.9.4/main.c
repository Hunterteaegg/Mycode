#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main()
{
    int value,position;

    printf("Enter a value and a position:");
    scanf("%d %d",&value,&position);
    for(int i=CHAR_BIT*sizeof(int);i>=0;i--,value>>=position-1)
    {
        if((01&value)==1)
        {
            position=1;
        }
        else
        {
            position=0;
        }
    }
    printf("The position value is %d",position);

    return 0;
}
