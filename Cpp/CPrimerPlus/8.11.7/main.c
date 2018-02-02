#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

void salary_cal(float time,float rate);
char menu_input(void);

int main()
{
    float time,rate;
    char choice;

    choice=menu_input();
    do
    {
        if(choice=='\n')
        {
            continue;
        }
        switch(choice)
        {
            case 'a':rate=8.75;
                     break;
            case 'b':rate=9.33;
                     break;
            case 'c':rate=10.00;
                     break;
            case 'd':rate=11.20;
                     break;
        }
        if(choice!='a'&&choice!='b'&&choice!='c'&&choice!='d')
        {
            break;
        }
        printf("Enter your time:");
        while((scanf("%f",&time))!=1)
        {
            printf("Error!\n");
            printf("Enter your time:");
        }
        salary_cal(time,rate);
        choice=menu_input();
    }while(choice>='a'&&choice<='d');
    printf("Done!");

    return 0;
}

void salary_cal(float time,float rate)
{
    float time_limit=40,salary,final_salary,tax;
    int salary_limit_1=300,salary_limit_2=450;

    if(time<=40)
    {
        salary=time*rate;
    }
    else
    {
        salary=time_limit*rate+(time-time_limit)*rate;
    }
    if(salary<=salary_limit_1)
    {
        tax=salary*0.15;
    }
    else if(salary>salary_limit_1&&salary<=salary_limit_2)
    {
        tax=salary_limit_1*0.15+(salary-salary_limit_1)*0.2;
    }
    else
    {
        tax=salary_limit_1*0.15+(salary_limit_2-salary_limit_1)*0.2+(salary-salary_limit_2)*0.25;
    }
    final_salary=salary-tax;
    printf("Your final salary is %f,tax is %f\n",final_salary,tax);

}

char menu_input(void)
{
    char message[80]="Enter the number corresponding to the desired pay rate or action:";
    char choice;
    int length,i;

    length=strlen(message);
    for(i=1;i<=length;i++)
    {
        printf("*");
    }
    printf("\n");
    printf("%s\n",message);
    printf("a.$8.75/hr b.9.33/hr\n");
    printf("c.10.00/hr d.11.20/hr\n");
    printf("e.quit\n");
    for(i=1;i<=length;i++)
    {
        printf("*");
    }
    printf("\n");
    scanf("%c",&choice);
    while(isspace(choice))
    {
        choice=getchar();
    }
    while(getchar()!='\n')
    {
        continue;
    }

    return choice;
}
