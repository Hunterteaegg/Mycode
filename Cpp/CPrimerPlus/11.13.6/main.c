#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int is_within(const char *target,char ch)
{
    int back;
    int i;

    for(i=0;i<(strlen(target));i++)
    {
        if(ch==target[i])
        {
            back=1;
            break;
        }
        else
        {
            back=0;
        }
    }

    return back;
}
int main()
{
    char source[20]="international";

    printf("%d",is_within(source,'z'));
    return 0;
}
