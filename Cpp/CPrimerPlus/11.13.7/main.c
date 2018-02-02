#include <stdio.h>
#include <stdlib.h>

char *mystrncpy(char *target,const char *source,int n)
{
    int i=0,x;

    while(target[i]!='\0')
    {
        i++;
    }
    for(x=0;x<n;x++,i++)
    {
        target[i]=source[x];
    }
    target[i+1]='\0';

    return target;
}

int main()
{
    char ch1[5]="abc";
    char ch2[4]="ef";

    printf("%s",mystrncpy(ch1,ch2,1));

    return 0;
}
