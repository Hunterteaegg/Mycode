#include <stdio.h>
#include <stdlib.h>

int main()
{
    char letter[26];
    char i;
    int num,n;

    for(i='a',num=0;i<='z';i++,num++)
    {
        letter[num]=i;
    }
    for(n=1,num=0;n<=26;n++,num++)
    {
        printf("%c",letter[num]);
    }

    return 0;
}
