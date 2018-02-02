#include <stdio.h>
#include <stdlib.h>

int main()
{
    int ch,count=0;

    while((ch=getchar())!=EOF)
    {
        count++;
    }
    printf("The number of graph is %d",count);

    return 0;
}
