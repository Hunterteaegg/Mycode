#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void reorder(char *target,int i,int len)
{
    char temp;

    temp=target[i];
    target[i]=target[len-i-1];
    target[len-i-1]=temp;
}

int main()
{
    char s[5]="abcd";
    int i;

    for(i=0;i<2;i++)
    {
        reorder(s,i,4);
    }
    puts(s);

    return 0;
}
