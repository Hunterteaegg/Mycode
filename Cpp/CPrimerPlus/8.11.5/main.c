#include <stdio.h>
#include <stdlib.h>

int get_number(void);

int main()
{
    int number,low_limit=0,up_limit=100;

    number=get_number();
    while(number!=50)
    {
        if(number<50)
        {
            low_limit=number;
            printf("The answer is from %d to %d\n",low_limit,up_limit);
            number=get_number();
        }
        else
        {
            up_limit=number;
            printf("The answer is from %d to %d\n",low_limit,up_limit);
            number=get_number();
        }
    }
    printf("You are right!The answer is 50.");

    return 0;
}

int get_number(void)
{
    int number;

    printf("Enter an integer(0-100):");
    while((scanf("%d",&number))!=1||number<=0||number>=100)
    {
        printf("Error!\n");
        printf("Enter an integer:");
    }

    return number;
}
