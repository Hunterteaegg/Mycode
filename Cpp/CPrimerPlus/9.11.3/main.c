#include <stdio.h>
#include <stdlib.h>

void chline(char ch,int i,int j);

int main()
{
    char ch;
    int i,j;

    printf("Enter a letter:");
    scanf("%c",&ch);
    printf("Enter i and j:");
    scanf("%d %d",&i,&j);
    chline(ch,i,j);

    return 0;
}

void chline(char ch,int i,int j)
{
    int a,b;

    for(a=1;a<=i;a++)
    {
        for(b=1;b<=j;b++)
        {
            printf("%c",ch);
        }
        printf("\n");
    }
}
