#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct library{
    char bookname[40];
    char author[40];
    float price;
};

void alpha_show(struct library *source,int num);
void price_show(struct library *source,int num);

int main()
{
    int num;

    printf("Enter book number:");
    scanf("%d",&num);
    struct library book[num];
    for(int i=0;i<num;i++)
    {
        printf("Enter the book name:");
        scanf("%s",book[i].bookname);
        printf("Enter the author:");
        scanf("%s",book[i].author);
        printf("Enter the price:");
        scanf("%f",&book[i].price);
    }
    printf("\non title:\n");
    alpha_show(&book[0],num);
    printf("\non price:\n");
    price_show(&book[0],num);

    return 0;
}

void alpha_show(struct library *source,int num)
{
    struct library temp[num];

    for(int i=0;i<num-1;i++)
    {
        for(int n=i+1;n<num;n++)
        {
            if(strcmp(source[i].bookname,source[n].bookname)>0)
            {
                temp[i]=source[n];
                source[n]=source[i];
                source[i]=temp[i];
            }
        }
    }
    for(int i=0;i<num;i++)
    {
        printf("%s %s %f\n",source[i].bookname,source[i].author,source[i].price);
    }
}

void price_show(struct library *source,int num)
{
    struct library temp[num];

    for(int i=0;i<num-1;i++)
    {
        for(int n=i+1;n<num;n++)
        {
            if(source[i].price>source[n].price)
            {
                temp[i]=source[n];
                source[n]=source[i];
                source[i]=temp[i];
            }
        }
    }
    for(int i=0;i<num;i++)
    {
        printf("%s %s %f\n",source[i].bookname,source[i].author,source[i].price);
    }
}
