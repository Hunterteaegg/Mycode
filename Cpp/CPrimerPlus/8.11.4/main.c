#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main()
{
    int count_letter=0,count_word=0,flag=1;
    float average;
    char ch;

    while((ch=getchar())!=EOF)
    {
        if(isalpha(ch))
        {
            count_letter++;
            flag=1;
        }
        if((isspace(ch))&&(flag==1))
        {
            count_word++;
            flag=0;
        }
    }
    average=count_letter/count_word;
    printf("The average is %f",average);

    return 0;
}
