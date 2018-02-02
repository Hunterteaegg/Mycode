#include <stdio.h>
#include <stdlib.h>

int main()
{
    char ch;
    int space_ct=0,n_ct=0,other_ct=0;

    while((ch=getchar())!='#')
    {
        if(ch==' ')
        {
            space_ct++;
        }
        else if(ch=="\n")
        {
            n_ct++;
        }
        else
        {
            other_ct++;
        }
        printf("space %d.change line %d,other %d.\n",space_ct,n_ct,other_ct);
    }
    return 0;
}
