///////////////////////////////////////////////////////
//
//  File name  : this.cpp
//  Description: Demonstrates Object-Oriented Programming
//               concepts in C++ using a class 'Arithmetic'
//               that performs addition and subtraction
//               operations using This Pointer.
//  Author     : Pallavi Sable
//  Date       : 20/10/2025
//
///////////////////////////////////////////////////////
#include<iostream>
using namespace std;

class Arithmetic
{
    public:
        int iNo1;
        int iNo2;
       
        Arithmetic()
        {
            this->iNo1 = 0;
            this->iNo2 = 0;
        }

        Arithmetic(int A,int B)
        {
            this->iNo1 = A;
            this->iNo2 = B;
            
        }

        int Addition()
        {
            int iAns = 0;
            iAns = this->iNo1 + this->iNo2;
            return iAns;
        }

        int Subtraction()
        {
            int iAns = 0;
            iAns = this->iNo1 - this->iNo2;
            return iAns;
        }
};


int main()
{

    Arithmetic aobj1(11,21);
    Arithmetic aobj2(21,10);

    int iRet =  0;

    iRet = aobj1.Addition();
    cout<<"Addition is :"<<iRet<<"\n";

    iRet = aobj1.Subtraction();
    cout<<"Subrtraction is :"<<iRet<<"\n";

    iRet = aobj2.Addition();
    cout<<"Addition is :"<<iRet<<"\n";

    iRet = aobj2.Subtraction();
    cout<<"Subtraction is :"<<iRet<<"\n";

    return 0;
}