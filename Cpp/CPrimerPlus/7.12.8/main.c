#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define time_lim 40
#define salary_1 300
#define salary_2 450
#define rate_1 0.15
#define rate_2 0.20
#define rate_3 0.25
#define base_1 8.75
#define base_2 9.33
#define base_3 10.00
#define base_4 11.20

int main()
{
    float base=0,tax,salary,act_salary,time;
    int length,i,choose;
    char message[50]="Enter the number corresponding to the desired pay rate or action:";

    length=strlen(message);
    for(i=1;i<=length;i++)
    {
        printf("*");
    }
    printf("\n");
    printf("%s\n",message);
    printf("1)$8.75/hr    2)$9.33/hr \n");
    printf("3)$10.00/hr   4)$11.20/hr \n");
    printf("5)quit \n");
    for(i=1;i<=length;i++)
    {
        printf("*");
    }
    printf("\n");
    do
    {
        scanf("%d",&choose);
        while(choose<1||choose>5)
        {
            printf("%s \n",message);
            scanf("%d",&choose);
        }
        switch(choose)
        {
            case 1:base=base_1;
                   break;
            case 2:base=base_2;
                   break;
            case 3:base=base_3;
                   break;
            case 4:base=base_4;
                   break;
        }
        if(choose==5)
        {
            break;
        }
        printf("Enter your time:");
        scanf("%f",&time);
        if(time<=time_lim)
        {
            salary=time*base;
        }
        else
        {
            salary=time_lim*base+(time-time_lim)*1.5*base;
        }
        if(salary<=salary_1)
        {
            tax=salary_1*rate_1;
        }
        else if(salary>salary_1&&salary<=salary_2)
        {
            tax=salary_1*rate_1+(salary-salary_1)*rate_2;
        }
        else if(salary>salary_2)
        {
            tax=salary_1*rate_1+(salary_2-salary_1)*rate_2+(salary-salary_2)*rate_3;
        }
        else
        {
            break;
        }
        act_salary=salary-tax;
        printf("Your total salary is %.2f,tax is %.2f,pure salary is %.2f \n",salary,tax,act_salary);
        printf("%s \n",message);
    }while(choose!=5);
    printf("Done!\n");

    return 0;
}
