#include <stdio.h>
#include <stdlib.h>

int main(int argc,char **argv)
{
    int i;

    for(i=argc;i>=1;i--)
    {
        puts(argv[i]);
    }

    return 0;
}
