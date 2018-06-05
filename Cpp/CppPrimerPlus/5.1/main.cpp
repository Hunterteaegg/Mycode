#include <iostream>

int main()
{
    int low,high;
    int result=0;

    std::cout<<"Enter two integers:";
    std::cin>>low;
    std::cin>>high;

    for(int i=low;i<=high;i++)
    {
        std::cout<<i<<" ";
        result+=i;
    }
    std::cout<<"The result is "<<result;

    return 0;
}
