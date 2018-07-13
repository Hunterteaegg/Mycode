#include <iostream>

using namespace std;

struct box
{
    char maker[40];
    float height;
    float width;
    float length;
    float volume;
};

 void show_box(box temp);
 void change_box(box *temp);

int main()
{
    box temp=
    {
        "SCAU",
        3,
        4,
        5,
    };
    change_box(&temp);
    show_box(temp);

    return 0;
}

void show_box(box temp)
{
    cout<<"The maker is "<<temp.maker<<endl;
    cout<<"The height is "<<temp.height<<endl;
    cout<<"The width is "<<temp.width<<endl;
    cout<<"The length is "<<temp.length<<endl;
    cout<<"The volume is "<<temp.volume<<endl;
}

void change_box(box *temp)
{
    temp->volume=(temp->height)*(temp->width)*(temp->length);
}
