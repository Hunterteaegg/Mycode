#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int myatoi(const char *target,int i)
{
    char ch;
    int total=0,n,a;

    for(n=i-1,a=0;n>=0;n--,a++)
    {
        ch=target[a];
        switch(ch)
        {
            case '0':total+=0*pow(10,n);
                     break;
            case '1':total+=1*pow(10,n);
                     break;
            case '2':total+=2*pow(10,n);
                     break;
            case '3':total+=3*pow(10,n);
                     break;
            case '4':total+=4*pow(10,n);
                     break;
            case '5':total+=5*pow(10,n);
                     break;
            case '6':total+=6*pow(10,n);
                     break;
            case '7':total+=7*pow(10,n);
                     break;
            case '8':total+=8*pow(10,n);
                     break;
            case '9':total+=8*pow(10,n);
                     break;
        }
    }

    return total;
}

int main()
{
    printf("%d",myatoi("123",3));

    return 0;
}
