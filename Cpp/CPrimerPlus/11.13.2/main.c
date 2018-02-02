#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

char *input(char *target,int n)
{
    int i=0;
    char ch;

    while(i<=n)
    {
        ch=getchar();
        if(isspace(ch))
        {
            break;
        }
        target[i]=ch;
        i++;
    }

    return target;
}

int main()
{
    int num;
    char source[num];

    printf("Enter the number:");
    scanf("%d",&num);
    getchar();
    printf("Enter your sentence:\n");
    input(source,num);
    puts(source);

    return 0;
}
