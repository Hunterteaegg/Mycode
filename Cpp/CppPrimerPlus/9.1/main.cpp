#include <iostream>
#include "golf.h"

using namespace std;

int main()
{
    golf mygolf;

    setgolf(mygolf);
    showgolf(mygolf);
    handicap(mygolf,5);
    showgolf(mygolf);

    return 0;
}
