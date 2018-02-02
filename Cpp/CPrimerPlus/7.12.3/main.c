#include <stdio.h>
#include <stdlib.h>

int main()
{
    int odd=0,odd_ave=0,odd_ct=0,even=0,even_ave=0,even_ct=0,input=0;

    printf("Enter a number:");
    while((scanf("%d",&input))!=0)
    {
        if(input==0)
        {
            break;
        }
        else if(input%2==0)
        {
            even=even+input;
            even_ct++;
        }
        else
        {
            odd=odd+input;
            odd_ct++;
        }
        printf("Enter a number:");
    }
    odd_ave=odd/odd_ct;
    even_ave=even/even_ct;
    printf("The odd number is %d,average is %d.The even number is %d,average is %d.\n",odd_ct,odd_ave,even_ct,even_ave);

    return 0;
}
