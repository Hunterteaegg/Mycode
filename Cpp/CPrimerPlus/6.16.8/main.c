#include <stdio.h>
#include <stdlib.h>

int main()
{
    double a,b,ans;
    int check;

    printf("Enter two number:");
    check =scanf("%lf %lf",&a,&b);
    while(check==2)
    {
        ans=(a-b)/(a*b);
        printf("The answer is %lf\n",ans);
        printf("Enter two number:");
        check =scanf("%lf %lf",&a,&b);
    }
    return 0;
}
