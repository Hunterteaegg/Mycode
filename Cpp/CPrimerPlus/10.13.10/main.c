#include <stdio.h>
#include <stdlib.h>

void add(int * source1,int * source2,int * target,int num)
{
    int i;

    for(i=0;i<num;i++)
    {
        target[i]=source1[i]+source2[i];
    }
}

void show(int * target,int num)
{
    int i;

    for(i=0;i<num;i++)
    {
        printf("%d ",target[i]);
    }
}

int main()
{
    int num1[4]={2,4,5,8};
    int num2[4]={1,0,4,6};
    int num3[4];

    add(num1,num2,num3,4);
    show(num3,4);

    return 0;
}


