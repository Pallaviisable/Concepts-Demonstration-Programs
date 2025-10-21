////////////////////////////////////////////////////////////
//
//  File Name  : ConstructorDefault.cpp
//  Description: This program demonstrates constructor 
//               overloading in C++. The class 'Demo' 
//               defines three constructors: default, 
//               single-parameter, and two-parameter, 
//               allowing different ways to initialize 
//               objects with varying data.
//  Author     : Pallavi Sable
//  Date       : 10/10/2025
//
////////////////////////////////////////////////////////////
#include<iostream>
using namespace std;

class Demo
{
    public:
        int iNo1;
        int iNo2;

        Demo()
        {
            iNo1 = 0;
            iNo2 = 0;
        }
        Demo(int a)
        {
            iNo1 = a;
            iNo2 = 0;
        }
        Demo(int a, int b)
        {
            iNo1 = a;
            iNo2 = b;
        }
};

int main()
{
    Demo dobj1;
    Demo dobj2(11);
    Demo dobj3(11,21);
    

    return 0;
}
