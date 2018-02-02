#include <stdio.h>
#include <stdlib.h>

void exchange(int *num1,int *num2);

int main()
{
    int num[100];

    for(int i=0;i<100;i++)
    {
        num[i]=(rand())%10+1;
    }
    for(int i=0;i<99;i++)
    {
        for(int n=i;n<100;n++)
        {
            if(num[i]<num[n])
            {
                exchange(&num[i],&num[n]);
            }
        }
    }
    for(int i=0;i<100;i++)
    {
        printf("%d\n",num[i]);
    }

    return 0;
}

void exchange(int *num1,int *num2)
{
    int temp;

    temp=*num1;
    *num1=*num2;
    *num2=temp;
}
