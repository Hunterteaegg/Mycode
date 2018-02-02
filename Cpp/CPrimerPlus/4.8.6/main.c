#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char first_name[40],second_name[40];

    printf("Enter your first name and second name:\n");
    scanf("%s %s",first_name,second_name);
    printf("%s %s\n",first_name,second_name);
    printf("%*d %*d\n",strlen(first_name),strlen(first_name),strlen(second_name),strlen(second_name));
    printf("%s %s\n",first_name,second_name);
    printf("%-*d %-*d",strlen(first_name),strlen(first_name),strlen(second_name),strlen(second_name));

    return 0;
}
