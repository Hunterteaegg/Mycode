#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#define LEN 20

void input(char *target)
{
    char ch;
    int i=0;

    while((ch=getchar())!='\n')
    {
        if(isspace(ch))
        {
            continue;
        }
        target[i]=ch;
        i++;
    }
    target[i]='\0';
}

int main()
{
    char source[LEN];

    printf("Enter your word:\n");
    input(source);
    puts(source);

    return 0;
}
