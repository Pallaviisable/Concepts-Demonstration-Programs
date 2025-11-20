////////////////////////////////////////////////////////////
//
//  File name :     forloop.c
//  Description :   This is program prints numbers using
//                  iteration for loop
//  Author :        Pallavi Sable
//  Date :          10/10/2025
//
////////////////////////////////////////////////////////////

#include<stdio.h>


void Display()
{
    int iCnt = 0;
    for(iCnt = 1 ; iCnt <= 5 ; iCnt ++)
    {
        printf("%d\t",iCnt);
    }

}

int main()
{
    Display();
    
}   
