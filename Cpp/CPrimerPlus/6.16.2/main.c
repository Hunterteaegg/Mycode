#include <stdio.h>
#include <stdlib.h>

int main()
{
    int list,row;

    for(row=1;row<=5;row++)
    {
        for(list=1;list<=row;list++)
        {
            printf("$");
        }
        printf("\n");
    }

    return 0;
}
