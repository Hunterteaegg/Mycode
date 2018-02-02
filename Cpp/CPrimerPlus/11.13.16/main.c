#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

void ori_pri(void)
{
    char ch;

    while((ch=getchar())!='\n')
    {
        putchar(ch);
    }
}

void upp_pri(void)
{
    char ch;

    while((ch=getchar())!='\n')
    {
        putchar(toupper(ch));
    }
}

void low_pri(void)
{
    char ch;

    while((ch=getchar())!='\n')
    {
        putchar(tolower(ch));
    }
}

int main(int argc,char *argv[])
{
    printf("Enter your sentence:\n");
    if(argv[1][1]=='p')
    {
        ori_pri();
    }
    if(argv[1][1]=='u')
    {
        upp_pri();
    }
    if(argv[1][1]=='l')
    {
        low_pri();
    }

    return 0;
}

