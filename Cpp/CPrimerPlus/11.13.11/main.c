#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void ori_printf(char (*target)[50]);
void asc_pri(char (*target)[50]);
void len_pri(char (*target)[50]);
void first_pri(char (*target)[50]);

int main()
{
    int i,status;
    char s[10][50];

    do
    {
        printf("1)origin 2)ASCII\n");
        printf("3)length 4)firstword\n");
        scanf("%d",&status);
        getchar();
        printf("Enter your 10 sentences:\n");
        for(i=1;i<=10;i++)
        {
            fgets(s[i],50,stdin);
        }
        switch(status)
        {
            case 1:ori_printf(s);
                   break;
            case 2:asc_pri(s);
                   break;
            case 3:len_pri(s);
                   break;
            case 4:first_pri(s);
                   break;
        }
    }while(status<1||status>4);
    return 0;
}

void ori_printf(char (*target)[50])
{
    int i;

    for(i=0;i<10;i++)
    {
        puts(target[i]);
    }
}

void asc_pri(char (*target)[50])
{
    int i,a,b;
    char *ptr[10];
    char *temp;

    for(i=0;i<10;i++)
    {
        ptr[i]=target[i];
    }
    for(i=0;i<10;i++)
    {
        for(a=0;a<49;a++)
        {
            for(b=a+1;b<50;b++)
            {
                if(strcmp(&target[i][a],&target[i][b])>0)
                {
                    temp=ptr[a];
                    ptr[a]=ptr[b];
                    ptr[b]=temp;
                }
            }
        }
    }
    for(i=0;i<10;i++)
    {
        puts(ptr[i]);
    }
}

void len_pri(char (*target)[50])
{
    int i;


}
