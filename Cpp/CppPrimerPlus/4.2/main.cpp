#include <iostream>

int main()
{
    std::string name;
    std::string dessert;

    std::cout<<"Enter your name:"<<std::endl;
    getline(std::cin,name);
    std::cout<<"Enter your favorite dessert:"<<std::endl;
    getline(std::cin,dessert);
    std::cout<<"I have some delicious "<<dessert;
    std::cout<<" for you , "<<name<<"."<<std::endl;

    return 0;
}
