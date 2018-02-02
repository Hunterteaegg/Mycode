#include <stdio.h>
#include <stdlib.h>

int main()
{
    char ch;

    while((ch=getchar())!='#')
    {
        switch(ch)
        {
            case '.':putchar('!');
                     break;
            case '!':putchar('!');putchar('!');
                     break;
            default:putchar(ch);
        }
    }
    return 0;
}
