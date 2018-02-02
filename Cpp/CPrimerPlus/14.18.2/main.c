#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct months
{
    char name[15];
    char name_s[4];
    int day;
    int num;
};

struct months MONTH[11]={
{"January","Jan",31,1},
{"February","Feb",28,2},
{"March","Mar",31,3},
{"April","Apr",30,4},
{"May","May",31,5},
{"June","Jun",30,6},
{"July","Jul",31,7},
{"August","Aug",31,8},
{"September","Sep",30,9},
{"October","Oct",31,10},
{"November","Nov",30,11},
{"December","Dec",31,12},
};

int month_days(int month,int day);

int main()
{
    int year,month,day;

    printf("Enter year:");
    scanf("%d",&year);
    printf("Enter month:");
    scanf("%d",&month);
    printf("Enter day:");
    scanf("%d",&day);
    printf("The total days is %d",month_days(month,day));

    return 0;
}

int month_days(int month,int day)
{
    int total=0;

    for(int i=0;i<month-1;i++)
    {
        total+=MONTH[i].day;
    }
    total=total+day;

    return total;
}

