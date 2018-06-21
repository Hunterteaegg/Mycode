#ifndef BANK_H_INCLUDED
#define BANK_H_INCLUDED

#include <iostream>
#include <cstring>

class Account
{
private:
    std::string name;
    int id;
    static int id_generate;
    double deposit;

public:
    //member functions
    void showDetail() const;
    void pullDeposit(double num);
    void pushDeposit(double num);

    //constructor
    Account(std::string m_name)
    {
       id=id_generate++;
       name=m_name;
    }

};

#endif // BANK_H_INCLUDED
