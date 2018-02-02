#include <stdio.h>
#include <stdlib.h>

int main()
{
    int input_day,output_day,output_week;

    printf("Enter days:");
    scanf("%d",&input_day);
    while(input_day>0)
    {
        output_day=input_day%7;
        output_week=input_day/7;
        printf("%d days are %d weeks, %d days.\n",input_day,output_week,output_day);
        printf("Enter days:");
        scanf("%d",&input_day);
    }

    return 0;
}
