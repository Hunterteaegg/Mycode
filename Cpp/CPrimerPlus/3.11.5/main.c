#include <stdio.h>
#include <stdlib.h>

int main()
{
    int age;
    double second;

    printf("Enter your age:");
    scanf("%d",&age);
    second=age*3.156e7;
    printf("Your age in seconds is:%f",second);

    return 0;
}
