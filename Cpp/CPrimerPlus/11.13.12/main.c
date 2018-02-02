#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main()
{
    char ch;
    int word=0,upper=0,lower=0,punct=0,number=0;
    int flag=0;

    printf("Enter your sentence:\n");
    while((ch=getchar())!=EOF)
    {
        if(isalnum(ch))
        {
            flag=1;
        }
        if(isspace(ch))
        {
            flag=0;
            word++;
        }
        if(isupper(ch))
        {
            upper++;
        }
        if(islower(ch))
        {
            lower++;
        }
        if(ispunct(ch))
        {
            punct++;
        }
        if(isdigit(ch))
        {
            number++;
        }
    }
    printf("There are %d words,%d uppers,%d lowers,%d puncts,%d numbers",word,upper,lower,punct,number);

    return 0;
}
