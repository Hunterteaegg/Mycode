#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct names{
char first[40];
char last[40];
};

int comp(const void *p1,const void *p2);

int main()
{
    struct names name[4]={
    {"JunJie","Ye"},{"JunFeng","Zhang"},{"ZhaoYu","Yao"},{"MaoFeng","Ye"}};

    qsort(name,4,sizeof(struct names),comp);
    for(int i=0;i<4;i++)
    {
        printf("%s %s\n",name[i].first,name[i].last);
    }
    return 0;
}

int comp(const void *p1,const void *p2)
{
    const struct names *ps1=(const struct names *)p1;
    const struct names *ps2=(const struct names *)p2;
    int res;

    res=strcmp(ps1->last,ps2->first);
    if(res!=0)
    {
        return res;
    }
    else
    {
        return strcmp(ps1->last,ps2->first);
    }
}
