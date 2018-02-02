#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char text[255];
    int i,m,n;

    printf("Enter a text:\n");
    scanf("%s",text);
    for(i=strlen(text)-1;i>=0;i--)
    {
        printf("%c",text[i]);
    }
    return 0;
}
