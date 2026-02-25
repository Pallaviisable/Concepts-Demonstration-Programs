////////////////////////////////////////////////////////////
//
//  File Name  : VirtualDemo1.cpp
//  Description: This program demonstrates how the size of 
//               a base class and a derived class object 
//               is calculated in C++. The derived class 
//               size includes all base class members plus 
//               its own members.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

class Base
{
    public:
        int i;                                   // Data member i
        int j;                                   // Data member j
};

class Derived : public Base
{
    public:
        int x;                                   // Data member x in derived class
};

int main()
{
    cout << sizeof(Base) << "\n";            // Size of Base class object (Output: 8)
    cout << sizeof(Derived) << "\n";         // Size of Derived class object (Output: 12)

    return 0;
}