#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

char get_first(void);

int main()
{
    char ch;

    printf("Enter a sentence:\n");
    ch=get_first();
    printf("The first letter is %c",ch);

    return 0;
}

char get_first(void)
{
    char ch;

    ch=getchar();
    while(isspace(ch))
    {
        ch=getchar();
    }
    while(getchar()!='\n')
    {
        continue;
    }

    return ch;
}
