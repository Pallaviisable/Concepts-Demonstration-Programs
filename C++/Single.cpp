////////////////////////////////////////////////////////////
//
//  File Name  : Single.cpp
//  Description: This program demonstrates how the size of 
//               a base class and a derived class object 
//               is calculated in C++. It shows that the 
//               derived class size includes all base class 
//               members plus its own members.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

class Base
{
    public:
        int i, j;

        void fun()
        {
            cout << "Inside Base fun\n";
        }
};

class Derived : public Base
{
    public:
        int x;

        void gun()
        {
            cout << "Inside Derived gun\n";
        }
};

int main()
{
    Base bobj;
    Derived dobj;

    cout << "Size of Base class object : " << sizeof(bobj) << "\n";
    cout << "Size of Derived class object : " << sizeof(dobj) << "\n";

    return 0;
}