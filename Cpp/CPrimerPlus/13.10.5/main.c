#include <stdio.h>
#include <stdlib.h>

int main(int argc,char **argv)
{
    FILE *fp;
    char ch[256];
    int i=0;
    char letter;
    int flag=0;

    fp=fopen(argv[2],"r");
    while(letter=fgetc(fp)!=EOF)
    {
        if(letter==argv[1])
        {
            flag=1;
        }
        if

    }
    return 0;
}
