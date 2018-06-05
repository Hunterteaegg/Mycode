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
    int num[12];
    int total=0;

    for(int i=0;i<12;i++)
    {
        std::cout<<"Enter the "<<months[i]<<" sale:";
        std::cin>>num[i];
        total+=num[i];
    }
    std::cout<<"The total is "<<total<<", and the average is "<<double(total/12);

    return 0;
}
