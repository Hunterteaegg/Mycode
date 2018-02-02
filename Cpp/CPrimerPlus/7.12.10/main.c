#include <stdio.h>
#include <stdlib.h>

#define single_limit 17850
#define host_limit 23900
#define common_limit 29750
#define divorce_limit 14875
#define rate_1 0.15
#define rate_2 0.28

int main()
{
    int choose,tax,limit,income,status;

    do
    {
        printf("Here is some item:\n");
        printf("1.single 2.host 3.common 4.divorce \n");
        printf("Enter your choice,press other keys will quit\n");
        status=scanf("%d",&choose);
        if(status==0||choose<1||choose>4)
        {
            break;
        }
        switch(choose)
        {
            case 1:limit=single_limit;
                   break;
            case 2:limit=host_limit;
                   break;
            case 3:limit=common_limit;
                   break;
            case 4:limit=divorce_limit;
                   break;
        }
        printf("Enter your income:");
        scanf("%d",&income);
        if(income<=limit)
        {
            tax=income*rate_1;
        }
        else
        {
            tax=limit*rate_1+(income-limit)*rate_2;
        }
        printf("Your tax fee is %d\n",tax);
    }while(choose>=1&&choose<=4&&status==1);
    printf("Done!");

    return 0;
}
