#include <stdio.h>
#include "pel2-2a.h"

void set_mode(int *status)
{
    if(*status!=0&&*status!=1&&*status!=-1)
    {
        *status=1;
        printf("Invalid mode specified.Mode 1(US) used.\n");
    }
}

void get_info(int *status,float *distance,float *fuel)
{
    if(*status==0)
    {
        printf("Enter distance traveled in kilometers:");
        scanf("%f",distance);
        printf("Enter fuel consumed in liters:");
        scanf("%f",fuel);
    }
    else if(*status==1)
    {
        printf("Enter distance traveled in miles:");
        scanf("%f",distance);
        printf("Enter fuel consumed in gallons:");
        scanf("%f",fuel);
    }
}

void show_info(int *status,float *distance,float *fuel)
{
    if(*status==0)
    {
        printf("Fuel consumption is %.2f liters per 100km.",((*fuel)/(*distance))*100);
    }
    if(*status==1)
    {
        printf("Fuel consumption is %.2f miles per gallon.",((*distance)/(*fuel)));
    }
}
