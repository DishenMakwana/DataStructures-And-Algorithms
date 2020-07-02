#include<bits/stdc++.h>
using namespace std;

void interchange(int *f,int *p)
{
    int temp=*f;
    *f=*p;
    *p=temp;
}
void bSort(int a[],int n)
{

    for(int i=0; i<n; i++)
    {

        int swap=0;
        for(int j=0; j<n-i-1; j++)
        {
            if(a[j]>a[j+1])
            {
                interchange(&a[j],&a[j+1]);
                swap++;

            }

        }
        if(swap==0)
        {

            break;
        }

    }
}

    void printArray(int a[],int n){
        for(int i=0;i<n;i++)
        {
            cout<< a[i] <<"\t";

        }

    }


    int main()
    {

        int a[5];
        for(int i=0; i<5; i++)
        {
            cin>>a[i];

        }

        bSort(a,5);
        printArray(a,5);
    }

