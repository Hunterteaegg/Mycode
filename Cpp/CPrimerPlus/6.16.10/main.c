#include <stdio.h>
#include <stdlib.h>

int main()
{
    int lower,upper,i,sum=0;


    printf("Enter lower and upper integer limits:");
    scanf("%d %d",&lower,&upper);
    while(lower<upper)
    {
        for(i=lower;i<=upper;i++)
        {
            sum=sum+i*i;
        }
        printf("The sums of the squares from %d to %d is %d \n",lower*lower,upper*upper,sum);
        printf("Enter next set of limits:");
        scanf("%d %d",&lower,&upper);
    }
    printf("Done");

    return 0;
}
