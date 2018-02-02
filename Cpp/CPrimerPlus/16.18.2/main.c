#include <stdio.h>
#include <stdlib.h>

#define AVE(X,Y) ((1/(X))+(1/(Y)))
int main()
{
    float a,b;

    printf("Enter two numbers:");
    scanf("%f %f",&a,&b);
    printf("The ave is %f",AVE(a,b));

    return 0;
}
