#include <stdio.h>
#include <stdlib.h>
#include "pel2-2a.h"

static int status;
static float distance;
static float fuel;

void set_mode(int mode)
{
    if(mode!=0&&mode!=1&&mode!=-1)
    {
        status=1;
        printf("Invalid mode specified.Mode 1(US) used.\n");
    }
    else if(mode==1)
    {
        status=1;
    }
    else if(mode==0)
    {
        status=0;
    }
}

void get_info(void)
{
    if(status==0)
    {
        printf("Enter distance traveled in kilometers:");
        scanf("%f",&distance);
        printf("Enter fuel consumed in liters:");
        scanf("%f",&fuel);
    }
    else if(status==1)
    {
        printf("Enter distance traveled in miles:");
        scanf("%f",&distance);
        printf("Enter fuel consumed in gallons:");
        scanf("%f",&fuel);
    }
}

void show_info(void)
{
    if(status==0)
    {
        printf("Fuel consumption is %.2f liters per 100 km.",(fuel/distance)*100);
    }
    else if(status==1)
    {
        printf("Fuel consumption is %.2f miles per gallon.",distance/fuel);
    }
}
