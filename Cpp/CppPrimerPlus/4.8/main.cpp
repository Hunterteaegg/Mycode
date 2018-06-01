#include <iostream>

struct Pizza
{
    std::string name;
    float diameter;
    float weight;
};

int main()
{
    using namespace std;

    Pizza* pizza=new Pizza;

    cout<<"Enter the name:";
    getline(cin,pizza->name);
    cout<<"Enter the diameter:";
    cin>>pizza->diameter;
    cout<<"Enter the weight:";
    cin>>pizza->weight;

    cout<<"The "<<pizza->name<<" is "<<pizza->weight<<" weight and "<<pizza->diameter<<" diameter";

    return 0;
}
