#include <stdio.h>
#include <stdlib.h>

int main()
{
    char ch;

    while((ch=getchar())!='#')
    {
        if(ch=='.')
        {
            putchar('!');
        }
        else if(ch=='!')
        {
            putchar('!');
            putchar('!');
        }
        else
        {
            putchar(ch);
        }
    }

    return 0;
}
