#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

void input(char *target,int num)
{
    char ch;
    int i=0;

    while(isspace((ch=getchar())))
    {
        continue;
    }
    putchar(ch);
    while((ch=getchar())!='\n')
    {
        if(i>num-2)
        {
            break;
        }
        target[i]=ch;
        i++;
    }
    target[i]='\0';
}

int main()
{
    int num;
    char source[num];

    printf("Enter your number:");
    scanf("%d",&num);
    getchar();
    printf("Enter your word:");
    input(source,num);
    puts(source);

    return 0;
}
