#include <stdio.h>
#include <stdlib.h>

int main()
{
    float input_cm,output_inch;
    int output_feet;

    printf("Enter a height in centimeters:");
    scanf("%f",&input_cm);
    while(input_cm>0)
    {
        output_feet=input_cm/30.48;
        output_inch=(input_cm-output_feet*30.48)/2.5;
        printf("%.1f cm = %d feet, %.1f inches\n",input_cm,output_feet,output_inch);
        printf("Enter a height in centimeters (<=0 to quit):");
        scanf("%f",&input_cm);
    }
    printf("bye");

    return 0;
}
