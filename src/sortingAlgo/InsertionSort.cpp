#include<bits/stdc++.h>
using namespace std;

// void printArray(int a[],int n)
// {
//     for(int i=0;i<n;i++)
//     {
//         cout<<a[i]<<" ";
//     }
// }

void insertionSort(int a[],int n)
{
    for(int i=1;i<n;i++)
    {
        int value=a[i];
        int hole=i-1;
        while(hole>=0 && value<a[hole])
        {
            a[hole+1]=a[hole];
            hole--;
        }
        a[hole+1]=value;
    }
}

int main()
{
    int n;
    cin >> n;
    int a[n];
    
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    insertionSort(a,n);
     
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
    return 0;
}
