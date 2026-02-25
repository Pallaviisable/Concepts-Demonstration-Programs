////////////////////////////////////////////////////////////
//
//  File Name  : PureVirtualDemo1.cpp
//  Description: This program demonstrates abstract classes 
//               and pure virtual functions in C++. It also 
//               shows issues when trying to instantiate a 
//               derived class that does not override all 
//               pure virtual functions.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

#pragma pack(1)
class Base
{
    public:
        int i, j;

        int Addition(int a, int b)                    // Concrete function
        {
            return a + b;
        }

        virtual int Substraction(int a, int b) = 0;  // Pure virtual (abstract) function
};

#pragma pack(1)
class Derived : public Base                          // Error: Must override pure virtual function
{
    public:
        int x;  
                                                    // Substraction() is not overridden → Derived remains abstract
};

int main()
{   
    // Base *bp = new Derived();                    // Error: Cannot instantiate abstract class

    return 0;
}