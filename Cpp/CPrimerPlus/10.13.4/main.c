#include <stdio.h>
#include <stdlib.h>

double max(double * target);

int main()
{
    double num[5]={2,8,6,5,3};

    printf("The max is %lf ",max(num));

    return 0;
}

double max(double * target)
{
    int i,num;
    double max;

    max=target[0];
    num=0;
    for(i=0;i<5;i++)
    {
        if(target[i]>max)
        {
            max=target[i];
            num=i;
        }
    }

    return num+1;
}
