#include <stdio.h>
#include <stdlib.h>

int main()
{
    char first_name[20];
    char second_name[20];

    printf("Enter your first name and second name:\n");
    scanf("%s %s",first_name,second_name);
    printf("%s"",""%s",first_name,second_name);

    return 0;
}
