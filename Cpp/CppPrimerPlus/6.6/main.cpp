#include <iostream>

int main()
{
    std::string months[12]=
    {
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December",
    };
    int sale[3][12];
    int result[3]=
    {
        0,0,0,
    };
    int total=0;

    for(int i=0;i<3;i++)
    {
        for(int j=0;j<12;j++)
        {
            std::cout<<"The "<<i<<" year and "<<j<<" month:";
            std::cin>>sale[i][j];
        }
    }

    for(int i=0;i<3;i++)
    {
        for(int j=0;j<12;j++)
        {
            total+=sale[i][j];
            result[i]+=sale[i][j];
        }
    }

    std::cout<<"The total is "<<total<<std::endl;

    for(int i=0;i<3;i++)
    {
        std::cout<<"The "<<i<<" year:"<<result[i];
    }

    return 0;
}
