#include <stdio.h>
#include <stdlib.h>

#define NUM 5
#define LEN 15

struct name_info{
    char first[LEN];
    char middle[LEN];
    char last[LEN];
};

struct info{
    int sec_num;
    struct name_info name;
};

struct info information[NUM]={
    {51414029, {"Jie", "Yu", "Zha"}},
    {51414010, {"Xiang", "Xiang", "Pan"}},
    {51414025, {"Jie", "Wen", "Jiang"}},
    {51414031, {"Ming", "Cheng", "Liu"}},
    {51414044, {"Qiang", " ", "Sha"}},

};

void show_info(struct info target);

int main()
{
    for(int i=0;i<NUM;i++)
    {
        show_info(information[i]);
    }

    return 0;
}

void show_info(struct info target)
{
        if(target.name.middle==" ")
        {
            printf("%s,%s -- %d\n",target.name.first,target.name.last,target.sec_num);
        }
        else
        {
            printf("%s,%s,%s. -- %d\n",target.name.first,target.name.last,target.name.middle,target.sec_num);
        }
}
