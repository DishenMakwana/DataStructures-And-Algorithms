#include<bits/stdc++.h>
#include<iostream>
#include<array>
using namespace std;

void merge(int *a,int *l,int L,int *r,int R)
{
   
    int i=0,j=0,k=0;
    while(i<L && j<R)
    {
        if(l[i]<r[j])
        {
            a[k++]=l[i++];
        }
        else
        {
            a[k++]=r[j++];
        }
     
    }
    while(i<L)
    {
        a[k++]=l[i++];
    }
    while(j<R)
    {
        a[k++]=r[j++];
    }
}
////////////////////////////////////////////////
void mergeSort(int *a,int n)
{
    if(n<2)
    {
        return;
    }
    int mid=n/2;
    int *l,*r;
    l=(int*)malloc(mid*sizeof(int));
    r=(int*)malloc((n-mid)*sizeof(int));

    for(int i=0;i<mid;i++)
    {
        l[i]=a[i];
    }
    for(int i=mid;i<n;i++)
    {
        r[i-mid]=a[i];
    }
     
    mergeSort(l,mid);
    mergeSort(r,n-mid);
     merge(a,l,mid,r,n-mid);
     free(l);
     free(r);
}
////////////////////////////////////////////////
int main()
{
    int n=10;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin >> a[i] ;
    }
    mergeSort(a,n);
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }

return 0;
}