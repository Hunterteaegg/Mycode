#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int power(int a,int b);
int power_2(int a,int b);

int main()
{
    int a,b;

    printf("Enter two number:");
    scanf("%d %d",&a,&b);
    printf("The answer is %d",power(a,b));

    return 0;
}

int power(int a,int b)
{
    if(a==0&&b==0)
    {
        return 1;
    }
    else if(b<0)
    {
        return 1/power_2(a,-b);
    }
    else
    {
        return power_2(a,b);
    }
}

int power_2(int a,int b)
{
    int ans;

    if(b==0)
    {
        return 1;
    }
    ans=a*(power_2(a,b-1));

    return ans;
}
