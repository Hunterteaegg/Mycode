#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    double s1=0,s2=0,i,n;

    printf("Enter the term:");
    scanf("%lf",&n);
    for(i=1;i<=n;i++)
    {
        s1=s1+(1.0/i);
        s2=s2+(1.0/i)*pow(-1,(n+1));
    }
    printf("S1=%lf,S2=%lf",s1,s2);

    return 0;
}
