#include <stdio.h>
#include <stdlib.h>

void copy_arr(double * target,double * source,int num);
void copy_ptr(double * target,double * source,int num);
void copy_ptrs(double * target,double * source,double * last);
void show(double * display);

int main()
{
    double source[5]={1.1,2.2,3.3,4.4,5.5};
    double target1[5];
    double target2[5];
    double target3[5];

    copy_arr(target1,source,5);
    copy_ptr(target2,source,5);
    copy_ptrs(target3,source,source+5);

    show(target1);
    show(target2);
    show(target3);

    return 0;
}

void copy_arr(double * target,double * source,int num)
{
    int i;

    for(i=0;i<num;i++)
    {
        target[i]=source[i];
    }
}

void copy_ptr(double * target,double * source,int num)
{
    int i;

    for(i=0;i<num;i++)
    {
        *(target+i)=*(source+i);
    }
}

void copy_ptrs(double * target,double * source,double * last)
{
    int i;

    for(i=0;i<last-source;i++)
    {
        target[i]=source[i];
    }
}

void show(double * display)
{
    int i;

    for(i=0;i<5;i++)
    {
        printf("%lf ",display[i]);
    }
    printf("\n");
}
