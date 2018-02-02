#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num,i,m,test=1;

    do
    {
        printf("Enter a positive number:");
        scanf("%d",&num);
        if(num>0)
        {
            break;
        }
    }while (num<=0);
    for(i=2;i<=num;i++)
    {
        for(m=2,test=1;(m*m)<=i;m++)
        {
            if(i%m==0)
            {
                test=0;
            }
        }
        if(test==1)
        {
            printf("%d ",i);
        }
    }
    return 0;
}
