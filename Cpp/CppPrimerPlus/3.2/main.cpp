#include <iostream>

using namespace std;

int main()
{
    /*data convert*/
    float length_convert=0.0254,mass_convert=(1.0/2.2);
    /*input data*/
    float height_foot,height_inch,weight_pound;
    /*output data*/
    float height_m,weight_kg,BMI;


    cout<<"Enter your height with foot and inch:";
    cin>>height_foot>>height_inch;
    cout<<"Enter your weight with pound:";
    cin>>weight_pound;

    height_m=(height_foot*12+height_inch)*length_convert;
    weight_kg=weight_pound*mass_convert;
    BMI=height_m/(weight_kg*weight_kg);

    cout<<"Your BMI index is "<<BMI;

    return 0;
}
