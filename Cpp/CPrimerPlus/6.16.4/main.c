#include <stdio.h>
#include <stdlib.h>

int main()
{
    int list,row,num;
    num=0;
    char letter='A';

    for(row=1;row<=6;row++)
    {
        for(list=1,num;list<=row;list++,num++)
        {
            printf("%c",letter+num);
        }
        printf("\n");
    }

    return 0;
}
