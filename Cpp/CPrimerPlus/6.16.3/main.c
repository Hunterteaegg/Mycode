#include <stdio.h>
#include <stdlib.h>

int main()
{
    int list,row;
    char letter;

    for(row=1;row<=6;row++)
    {
        for(letter='F',list=1;list<=row;letter--,list++)
        {
            printf("%c",letter);
        }
        printf("\n");
    }

    return 0;
}
