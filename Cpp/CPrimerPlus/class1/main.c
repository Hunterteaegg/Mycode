#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a,b;

    while(scanf("%d %d",&a,&b)!=0 )
    {

    if(a+b>10)
    {
        printf("���a��b�ĺͣ�%d\n",a+b);
    }
    else
    {
        printf("a+b<10\n");
    }
    }

    return 0;
}
