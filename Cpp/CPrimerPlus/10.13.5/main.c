#include <stdio.h>
#include <stdlib.h>

double max(double * target)
{
    int i;
    double max;

    max=target[0];
    for(i=0;i<5;i++)
    {
        if(max<target[i])
        {
            max=target[i];
        }
    }

    return max;
}

double min(double * target)
{
    int i;
    double min;

    min=target[0];
    for(i=0;i<5;i++)
    {
        if(min>target[i])
        {
            min=target[i];
        }
    }

    return min;
}

int main()
{
    double num[10]={2.7,8.5,12.6,55.4,36.2,61.2,26.3,46.2,36.1,14.5};

    printf("The difference is %lf ",max(num)-min(num));

    return 0;
}
