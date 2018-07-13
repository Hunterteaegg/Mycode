#include <iostream>
#include <cstring>
#include "bank.h"

using namespace std;

int main()
{
    Account account[3]=
    {
        Account("Bush"),
        Account("Obama"),
        Account("Trump"),
    };

    account[0].pullDeposit(36.52);
    account[1].pushDeposit(39.5);
    account[2].pushDeposit(99.6);
    account[1].pullDeposit(20.6);

    for(int i=0;i<3;i++)
    {
        account[i].showDetail();
    }

    return 0;
}
