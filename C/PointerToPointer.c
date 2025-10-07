
///////////////////////////////////////////////////////
//
//  File name :     PointertoPointer.c
//  Description :   This program demonstrates multiple levels of
//                  indirection using pointers (up to five levels)
//                  and accesses the same integer value through each
//                  pointer level.
//  Author :        Pallavi Sable
//  Date :          06/10/2025
//
///////////////////////////////////////////////////////
#include<stdio.h>

int main()
{
    int no = 11;

    int *p = &no;
    int **q = &p;
    int ***a = &q;
    int ****b = &a;
    int *****c = &b;

    printf("%d\n",no);
    printf("%d\n",*p);
    printf("%d\n",**q);
    printf("%d\n",***a);
    printf("%d\n",****b);
    printf("%d\n",*****c);
    
    return 0;
}