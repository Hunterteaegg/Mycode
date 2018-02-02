#include <stdio.h>
#include <stdlib.h>
#include "safe_get.h"

void sum(int *target,int size,int times);

int main()
{
    int num[100];

    for(int i=0;i<100;i++)
    {
        num[i]=i;
    }
    sum(num,100,5);

    return 0;
}

void sum(int *target,int size,int times)
{
    int answer[times];
    int status[size];

    for(int i=0;i<size;i++)
    {
        status[i]=1;
    }
    for(int n=0;n<times;n++)
    {
        for(int i=0;i<size;i++)
        {
            if(status[i]==1)
            {
                answer[n]=target[rand()%size];
                status[rand()%size]=0;
            }
        }
    }
    for(int i=0;i<times;i++)
    {
        printf("%d ",answer[i]);
    }
}
