#include <stdio.h>
#include <stdlib.h>

int main()
{
    char ch;
    int count=0,inword=0;

    while((ch=getchar())!='#')
    {
        if(ch=='e'&&inword==0)
        {
            inword=1;
        }
        else if(ch=='i'&&inword==1)
        {
            inword=0;
            count++;
        }
        else
        {
            inword=0;
        }
    }
    printf("The time of ei is %d\n",count);

    return 0;
}
