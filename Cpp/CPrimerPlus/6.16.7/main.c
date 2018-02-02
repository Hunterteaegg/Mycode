#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char word[50];
    int length,i;

    printf("Enter a word:");
    scanf("%s",word);
    length=strlen(word);
    for(i=length-1;i>=0;i--)
    {
        printf("%c",word[i]);
    }
    return 0;
}
