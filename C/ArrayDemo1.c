///////////////////////////////////////////////////////
//  Array is a linaer data structure that stores homogenous 
//  elements in an indexed format.
//
//  File name :     ArrayDemo1.c
//  Description :   This program demonstrates the use of the sizeof
//                  operator with arrays.
//                  It shows how the total memory size varies based on 
//                  array length and initialization.And also tells 
//                  us the ways to intalize our array.
//
//  Author :        Pallavi Sable
//  Date :          05/10/2025
//
///////////////////////////////////////////////////////#include<stdio.h>

int main()
{
    int Arr[4] = {10,20,30,40};
    int Brr[] = {10,20,30,40,50};
    int Crr[6] = {10,20,30};

    printf("Size of Arr is : %lu\n",sizeof(Arr)); // 16
    printf("Size of Brr is : %lu\n",sizeof(Brr)); // 20
    printf("Size of Crr is : %lu\n",sizeof(Crr)); // 24

    return 0;
}
