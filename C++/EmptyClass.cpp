////////////////////////////////////////////////////////////
//
//  File Name  : SizeOfClassDemo.cpp
//  Description: This program demonstrates the sizeof operator
//               for a class in C++. Even an empty class 
//               occupies at least 1 byte of memory.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

class Demo
{
    public:
        void Display()
        {
            cout << "Inside Display\n";
        }
};

int main()
{
    Demo dobj;

    cout << sizeof(dobj) << "\n";     // Output: 1 byte

    return 0;
}