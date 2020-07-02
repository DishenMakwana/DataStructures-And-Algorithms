#include<bits/stdc++.h>
using namespace std;

// void printArray(int a[],int n)
// {
//     for(int i=0;i<n;i++)
//     {
//         cout<<a[i]<<" ";
//     }
// }
int* insertionSort(int a[],int n)
{
    for(int i=1;i<n;i++)
    {
        int value=a[i];
        int hole=i;
        while(hole>0 && value<a[hole-1])
        {
            a[hole]=a[hole-1];
            hole--;
        }
        a[hole]=value;
    }
     return a;
    
}
int main()
{
   int a[5];
    for(int i=0;i<5;i++)
    {
        cin>>a[i];
    }
    
    int *arr=insertionSort(a,5);
     for(int i=0;i<5;i++)
    {
        cout<<a[i]<<" ";
    }
    return 0;
}