#include<bits/stdc++.h>
using namespace std;
int quickPartition(int *a,int start,int end)
{
    int pivot=a[end];
    int pIndex=start;
    for(int i=start;i<end;i++)
    {
        if(a[i]<=pivot)
        {
            swap(a[i],a[pIndex]);
            pIndex++;
        }

    }
            swap(a[pIndex],a[end]);
            return pIndex;
        

} 
void quickSort(int *a,int start,int end)
{
    if(start<end){
        int pIndex=quickPartition(a,start,end);
    quickSort(a,start,pIndex-1);
    quickSort(a,pIndex+1,end);
    }
    
}
int main()
{
    int a[10];
    for(int i=0;i<10;i++)
    {
        cin>>a[i];
    }
    quickSort(a,0,9);
    for(int i=0;i<10;i++)
    {
        cout<<a[i]<<" ";
    }
    return 0; 
}