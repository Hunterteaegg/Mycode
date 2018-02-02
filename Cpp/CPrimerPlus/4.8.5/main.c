#include <stdio.h>
#include <stdlib.h>

int main()
{
    float speed_byte,speed_bit,size,time;

    printf("Enter speed and size:\n");
    scanf("%f""%f",&speed_bit,&size);
    speed_byte=speed_bit/8;
    time=size/speed_byte;
    printf("At %.2f megabits per second, a file of %.2f megabytes\n",speed_bit,size);
    printf("downloads in %.2f seconds",time);

    return 0;
}
