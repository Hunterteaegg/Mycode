#include <stdio.h>
#include <stdlib.h>

char *input(char *target,char ch,int num)
{
    int i;
    char *ptr;

    for(i=0;i<num;i++)
    {
        if(ch==target[i])
        {
            ptr=&target[i];
            break;
        }
        else
        {
            ptr=NULL;
        }
    }

    return ptr;
}

int main()
{
    char source[20]="international";

    printf("%p",input(source,'n',20));
    return 0;
}
