#include <stdio.h>
#include <stdlib.h>

float calculator(float a,float b);

int main()
{
    float a,b,ans;
    int status;

    printf("Enter two numbers:");
    status=scanf("%f %f",&a,&b);
    while(status==2)
    {
        ans=calculator(a,b);
        printf("The answer is %f \n",ans);
        printf("Enter two numbers:");
        status=scanf("%f %f",&a,&b);
    }

    return 0;
}

float calculator(float a,float b)
{
    float ans;
    ans=(a-b)/(a*b);

    return ans;
}
