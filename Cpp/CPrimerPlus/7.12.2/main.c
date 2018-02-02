#include <stdio.h>
#include <stdlib.h>

int main()
{
    char ch;
    int count=0;

    while((ch=getchar())!='#')
    {
        printf("%5c ",ch);
        printf("%5d ",ch);
        count++;
        if(count%8==0)
        {
            printf("\n");
        }
    }

    return 0;
}
