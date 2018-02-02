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

struct months MONTH[12]={
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


char *s_gets(char *st,int n);
int month_days(char *target);

int main()
{
    char month_name[15];

    printf("Enter month name:");
    s_gets(month_name,15);
    printf("The total days is %d",month_days(month_name));

    return 0;
}

int month_days(char *target)
{
    int total=0;

    for(int i=0;i<12;i++)
    {
        total+=MONTH[i].day;
        if(strcmp(target,MONTH[i].name)==0)
        {
            break;
        }
    }

    return total;
}

char *s_gets(char *st,int n)
{
    char *ret_val;
    char *find;

    ret_val=fgets(st,n,stdin);
    if(ret_val)
    {
        find=strchr(st,'\n');
        if(find)
        {
            *find='\0';
        }
        else
        {
            while(getchar()!='\n')
            {
                continue;
            }
        }
    }

    return ret_val;
}
