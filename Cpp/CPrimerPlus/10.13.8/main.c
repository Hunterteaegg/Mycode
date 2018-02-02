#include <stdio.h>
#include <stdlib.h>

void copy_arr(double (* target),double (*source),int num)
{
    int i;

    for(i=0;i<num;i++)
    {
        target[i]=source[i];
    }
}

void show(double *display)
{
    int i;

    for(i=0;i<=2;i++)
    {
        printf("%.1lf ",display[i]);
    }
}

int main()
{
    double num[7]={1.1,2.2,3.3,4.4,5.5,6.6,7.7};
    double target[3];

    copy_arr(target,num+2,3);
    show(target);

    return 0;
}
