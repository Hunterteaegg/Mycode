#include <stdio.h>
#include <stdlib.h>

#define base_per_h 10
#define time_lim 40
#define salary_1 300
#define salary_2 450
int main()
{
    float time,act_time,salary,cl_salary,tax;

    printf("Enter your time:");
    scanf("%f",&time);
    if(time<=time_lim)
    {
        act_time=time;
    }
    else
    {
        act_time=time_lim+(time-time_lim)*1.5;
    }
    salary=base_per_h*act_time;
    if(salary<=salary_1)
    {
        tax=salary*0.15;
    }
    else if(salary>salary_1&&salary<=salary_2)
    {
        tax=salary_1*0.15+(salary-salary_1)*0.2;
    }
    else
    {
        tax=salary_1*0.15+(salary_2-salary_1)*0.2+(salary-salary_2)*0.25;
    }
    cl_salary=salary-tax;
    printf("The total salary is %.2f,tax is %.2f,clean salary is %.2f",salary,tax,cl_salary);
    return 0;
}
