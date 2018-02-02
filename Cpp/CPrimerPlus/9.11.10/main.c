#include <stdio.h>
#include <stdlib.h>

int to_base_n(int input,int al)
{
    int r;

    r=input%al;
    if(input>=al)
    {
        to_base_n(input/al,al);
    }
    printf("%d",r);

    return 0;
}

int main()
{
    int a,b;

    printf("Enter two number:");
    scanf("%d %d",&a,&b);
    to_base_n(a,b);

    return 0;
}
