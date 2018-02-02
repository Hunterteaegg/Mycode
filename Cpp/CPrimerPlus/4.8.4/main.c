#include <stdio.h>
#include <stdlib.h>

int main()
{
    float height_cm,height_m;
    char name[10];

    printf("Enter your name and height in cm:\n");
    scanf("%s""%f",name,&height_cm);
    height_m=height_cm/100;
    printf("%s,you are %.3f meters tall\n",name,height_m);

    return 0;
}
