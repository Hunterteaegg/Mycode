#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int check_place(char ch);
void test(void);

int main()
{
    printf("Enter a paragraph:\n");
    test();

    return 0;
}

void test(void)
{
    char ch;

    while((ch=getchar())!='\n')
    {
        if((check_place(ch))==-1)
        {
            printf("It is not a letter,return -1\n");
        }
        else
        {
            printf("It is a letter,the number %d\n",check_place(ch));
        }
    }
}

int check_place(char ch)
{
    if((isalpha(ch))==0)
    {
        return -1;
    }
    else
    {
        if((isupper(ch))==1)
        {
            return ch-64;
        }
        else
        {
            return ch-96;
        }
    }
}
