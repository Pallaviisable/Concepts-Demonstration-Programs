////////////////////////////////////////////////////////////
//
//  File Name  : userNamespace.cpp
//  Description: This program demonstrates the use of 
//               namespaces in C++. It shows how the same 
//               variable name can exist in different 
//               namespaces and be accessed using scope 
//               resolution operator (::).
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

namespace XYZ
{
    int i = 11;                               // Variable i in namespace XYZ
}

namespace PQR
{
    int i = 21;                               // Variable i in namespace PQR
}

int main()
{
    cout << XYZ::i << "\n";                  // Accessing i from XYZ namespace (Output: 11)
    cout << PQR::i << "\n";                  // Accessing i from PQR namespace (Output: 21)

    return 0;
}