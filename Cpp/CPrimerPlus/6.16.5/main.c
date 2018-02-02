#include <stdio.h>
#include <stdlib.h>

int main()
{
    int row,space;
    char letter,ch;

    printf("Enter your letter:");
    scanf("%c",&letter);
    for(row=0;row<=letter-'A';row++)
    {
        for(space=0;space<letter-'A'-row;space++)
        {
            printf(" ");
        }
        for(ch='A';ch<='A'+row;ch++)
        {
            printf("%c",ch);
        }
        ch-=2;
        while(ch!='A'-1)
        {
            printf("%c",ch--);
        }
        printf("\n");
    }
    return 0;
}
