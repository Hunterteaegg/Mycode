#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main()
{
    char ch;
    int count_low=0,count_up=0;

    while((ch=getchar())!=EOF)
    {
        if(islower(ch))
        {
            count_low++;
        }
        else if(isupper(ch))
        {
            count_up++;
        }
    }
    printf("lower letter is %d, upper letter is %d",count_low,count_up);

    return 0;
}
