#include <bits/stdc++.h>
using namespace std;
int* countingSort(int a[], int n,int pos)
{
    
    int output[n];
    int ct[10]={0};
    
    for (int i = 0; i < n; i++)
    {
        ct[(a[i]/pos)%10]++;
    }
    for (int i = 1; i < 10; i++)
    {
        ct[i] += ct[i - 1];
    }

    for (int i = n - 1; i >= 0; i--)
    {
        output[--ct[(a[i]/pos)%10]] = a[i];
    }
    for (int i = 0; i < n; i++)
    {
        a[i]=output[i];
    } 
    
    return a;
    
}

int* redixSort(int a[],int n)
{
     int max = a[0];
    for (int i = 1; i < n; i++)
    {
        if (a[i] > max)
        {
            max = a[i];
        }
    }
    int *ans;
    for(int pos=1;(max/pos)>0;pos=pos*10)
    {
        ans=countingSort(a,n,pos);
    }
    //cout<<"back"<<" ";
    return ans;
}

int main()
{

    int a[5];
    for (int i = 0; i < 5; i++)
    {
        cin >> a[i];
    }

    int *ans = redixSort(a, 5);
    for (int i = 0; i < 5; i++)
    {
        cout << ans[i] << " ";
    }
}
