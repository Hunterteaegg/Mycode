#include <stdio.h>
#include <stdlib.h>

int main(int argc,char **argv)
{
    double a,b;
    FILE *fp;

    if(argc==1)
    {
        fscanf(stdin,"%lf %lf",&a,&b);
        fprintf(stdout,"%lf",(a+b)/2);
    }
    else
    {
        fp=fopen(argv[1],"a+");
        fscanf(fp,"%lf %lf",&a,&b);
        fprintf(fp,"%lf",(a+b)/2);
        fclose(fp);
    }

    return 0;
}
