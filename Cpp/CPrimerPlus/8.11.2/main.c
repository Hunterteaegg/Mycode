#include <stdio.h>
#include <stdlib.h>

int main()
{
    int ch,count=0;

    while((ch=getchar())!=EOF)
    {
        printf("%d ",ch);
        count++;
        if(count%10==0)
        {
            printf("\n");
        }
    }

    return 0;
}
