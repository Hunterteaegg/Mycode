#include <stdio.h>
#include <stdlib.h>
#include <time.h>

double time_cul(double clock_1,double clock_2);

int main()
{
    double clock_1,clock_2;

    clock_1=clock();
    for(int i=0;i<10;i++)
    {
        printf("Hello world!\n");
    }
    clock_2=clock();
    printf("The time is %lf",time_cul(clock_1,clock_2));

    return 0;
}

double time_cul(double clock_1,double clock_2)
{
    return ((clock_2-clock_1)/CLOCKS_PER_SEC);
}
