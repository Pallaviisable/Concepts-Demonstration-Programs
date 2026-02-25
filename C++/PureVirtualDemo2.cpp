////////////////////////////////////////////////////////////
//
//  File Name  : PureVirtualDemo2.cpp
//  Description: This program demonstrates the use of 
//               abstract classes and pure virtual functions 
//               in C++. It shows how a derived class can 
//               override pure virtual functions and how 
//               upcasting works with base class pointers.
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

        int Addition(int a, int b)                   // Concrete function
        {
            return a + b;
        }

        virtual int Substraction(int a, int b) = 0;  // Pure virtual (abstract) function
};

#pragma pack(1)
class Derived : public Base
{
    public:
        int x;

        int Substraction(int a, int b)               // Concrete implementation
        {
            return a - b;
        }

        int Multiplication(int a, int b)             // Concrete function
        {
            return a * b;
        }
};

int main()
{   
    Base *bp = new Derived();                        // Upcasting
    int iRet = 0;

    iRet = bp->Addition(11, 10);                     // Allowed: Base function
    cout << iRet << "\n";                            // Output: 21

    iRet = bp->Substraction(11, 10);                 // Allowed: Overridden function in Derived
    cout << iRet << "\n";                            // Output: 1

    // iRet = bp->Multiplication(11, 10);            // ERROR: Base pointer cannot access Derived-specific members

    return 0;
}