#include <stdio.h>
#include <stdlib.h>

void lostspace(char *target);

int main()
{
    char s[30];

    printf("Enter a sentence:\n");
    while(fgets(s,30,stdin)&&s[0]!='\n')
    {
        lostspace(s);
        puts(s);
        printf("Enter a sentence:\n");
    }

    return 0;
}

void lostspace(char *target)
{
    char *ptr;

    while(*target)
    {
        if(*target==' ')
        {
            ptr=target;
            do
            {
                *ptr=*(ptr+1);
                ptr++;
            }while(*ptr);
        }
        else
        {
            target++;
        }
    }
}
