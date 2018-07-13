#include <iostream>

using namespace std;

int main()
{
   long double r=0;

   for(int i=47,j=5;j>0;i--,j--)
   {
       r*=i/j;
   }

   r=(1/r)*(1/27);

   cout<<"The result is "<<r<<endl;

   return 0;
}
