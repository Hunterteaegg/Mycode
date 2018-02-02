#include <stdio.h>
#include <stdlib.h>

int max(int * target);

int main()
{
    int num[5]={2,8,6,5,3};

    printf("The max is %d ",max(num));

    return 0;
}

int max(int * target)
{
    int i,max;

    max=target[0];
    for(i=0;i<5;i++)
    {
        if(target[i]>max)
        {
            max=target[i];
        }
    }

    return max;
}
