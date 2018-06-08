#include <iostream>
#include <stdbool.h>

using namespace std;

bool compare(int left,int right,int i)//number "i" need to be compared between left and right
{
    if(i>=left&&i<=right)
    {
        return true;
    }
    if(i>=right&&i<=left)
    {
        return false;
    }

    return false;
}

int main()
{
    int insertNum=4;//the number that needs to insert
    int N=5;//array size
    int origin[N]={1,2,3,5,6};//an ordered array
    int result[N+1];//an ordered inserted array
    bool inserted=false;//check if insert the number

    /*
    insert process
    */
    for(int i=0;i<N;i++)
    {
        if(inserted)//record if insert
        {
            result[i+1]=origin[i];
            continue;
        }
        if(compare(origin[i],origin[i+1],insertNum))
        {
            result[i+1]=insertNum;
            inserted=true;
        }
        result[i]=origin[i];

    }
    for(int i=0;i<N+1;i++)
    {
        printf("%d\n",result[i]);
    }


    return 0;
}
