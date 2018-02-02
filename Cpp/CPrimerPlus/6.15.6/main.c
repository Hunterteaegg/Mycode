#include <stdio.h>
#include <stdlib.h>

int main()
{
    int row,list;

    for(list=1;list<=4;list++)
    {
        for(row=1;row<=8;row++)
        {
            printf("$");
        }
        printf("\n");
    }

    return 0;
}
