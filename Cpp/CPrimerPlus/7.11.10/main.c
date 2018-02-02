#include <stdio.h>
#include <stdlib.h>

int main()
{
    char ch;

    while((ch=getchar()!='#'))
    {
        if(ch=='n')
            continue;
        printf("Step 1\n");
        if(ch=='c')
            continue;
        else if(ch=='b')
            break;
        else if(ch=='h')
            printf("Step 3\n");
        printf("Step 2\n");
    }
    printf("Done\n");
    return 0;
}
