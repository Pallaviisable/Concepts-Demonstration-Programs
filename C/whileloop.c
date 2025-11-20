////////////////////////////////////////////////////////////
//
//  File name :     whileloop.c
//  Description :   This is program prints numbers using
//                  iteration while loop
//  Author :        Pallavi Sable
//  Date :          15/10/2025
//
////////////////////////////////////////////////////////////

#include<stdio.h>


void Display()
{
    int iCnt = 0;
    iCnt = 1 ;
    while(iCnt <= 5)
    {
        printf("%d\t",iCnt);
        iCnt++;
    }

}




int main()
{
    Display();
    
}   

