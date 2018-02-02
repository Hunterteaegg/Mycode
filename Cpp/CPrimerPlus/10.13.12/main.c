#include <stdio.h>
#include <stdlib.h>

#define YEARS 5
#define MONTHS 12

void sum_all(int year,int month,const float rain[year][month])
{
    int i,n;
    float total,subtotal;

    for(i=0,total=0;i<YEARS;i++)
    {
        for(n=0,subtotal=0;n<month;n++)
        {
            subtotal+=rain[i][n];
        }
        printf("%5d %15.1f\n",2010+i,subtotal);
        total+=subtotal;
    }
    printf("\nThe yearly average is %1.f inches.\n\n",total/YEARS);
}

void sum_month(int year,int month,const float rain[year][month])
{
    int i,n;
    float subtotal;

    for(n=0;n<month;n++)
    {
        for(i=0,subtotal=0;i<year;i++)
        {
            subtotal+=rain[i][n];
        }
        printf("%4.1f ",subtotal/year);
    }
}

int main()
{
    const float rain[YEARS][MONTHS]=
    {
        {
            4.3,4.3,4.3,3.0,2.0,1.2,0.2,0.2,0.4,2.4,3.5,6.6
        },
        {
            8.5,8.2,1.2,1.6,2.4,0.0,5.2,0.9,0.3,0.9,1.4,7.3
        },
        {
            9.1,8.5,6.7,4.3,2.1,0.8,0.2,0.2,1.1,2.3,6.1,8.4
        },
        {
            7.2,9.9,8.4,3.3,1.2,0.8,0.4,0.0,0.6,1.7,4.3,6.2
        },
        {
            7.6,5.6,3.8,2.8,3.8,0.2,0.0,0.0,0.0,1.3,2.6,5.2
        }
    };
    sum_all(YEARS,MONTHS,rain);
    printf("MONTHLY AVERAGES:\n\n");
    printf("Jan Feb Mar Apr May Jun Jul Aug Sep Oct ");
    printf("Nov Dec \n");
    sum_month(YEARS,MONTHS,rain);

    return 0;
}
