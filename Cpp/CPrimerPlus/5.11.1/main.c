#include <stdio.h>
#include <stdlib.h>

int main()
{
    const int min_per_hour=60;
    int input_min,output_min,output_hour;

    printf("Enter minutes:");
    scanf("%d",&input_min);
    while(input_min>0)
    {
        output_min=input_min%min_per_hour;
        output_hour=input_min/min_per_hour;
        printf("The time is %d hours and %d minutes.\n",output_hour,output_min);
        printf("Enter minutes or quit:");
        scanf("%d",&input_min);
    }

    return 0;
}
