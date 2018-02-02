#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

char menu(void);
float add(float a,float b);
float subtract(float a,float b);
float multiply(float a,float b);
float divide(float a,float b);

int main()
{
        char input;
        float first_num,second_num,answer;

        do
        {
            input=menu();
            if(input=='q')
            {
                break;
            }
            printf("Enter first number:");
            while((scanf("%f",&first_num))!=1)
            {
                printf("Enter first number:");
            }
            printf("Enter second number:");
            while((scanf("%f",&second_num))!=1)
            {
                printf("Enter second number:");
            }
            switch(input)
            {
                case 'a':answer=add(first_num,second_num);
                         printf("%f + %f = %f\n",first_num,second_num,answer);
                         break;
                case 's':answer=subtract(first_num,second_num);
                         printf("%f - %f = %f\n",first_num,second_num,answer);
                         break;
                case 'm':answer=multiply(first_num,second_num);
                         printf("%f * %f = %f\n",first_num,second_num,answer);
                         break;
                case 'd':answer=divide(first_num,second_num);
                         printf("%f / %f = %f\n",first_num,second_num,answer);
                         break;
            }
        }while(input=='a'||input=='s'||input=='m'||input=='d');
        printf("Bye.\n");

    return 0;
}

char menu(void)
{
    char input;

    printf("Enter the operation of your choice:\n");
    printf("a.add s.subtract\n");
    printf("m.multiply d.divide\n");
    printf("q.quit\n");
    scanf("%c",&input);
    while(isspace(input))
    {
        input=getchar();
    }
    while((getchar())!='\n')
    {
        continue;
    }

    return input;
}

float add(float a,float b)
{
    float answer;

    answer=a+b;

    return answer;
}

float subtract(float a,float b)
{
    float answer;

    answer=a-b;

    return answer;
}

float multiply(float a,float b)
{
    float answer;

    answer=a*b;

    return answer;
}

float divide(float a,float b)
{
    float answer;

    while(b==0)
    {
        printf("Enter second number:");
        scanf("%f",&b);
    }
    answer=a/b;

    return answer;
}
