#include <bits/stdc++.h>
using namespace std;

// void printArray(int a[],int n)
// {
//     for(int i=0;i<n;i++)
//     {
//         cout<<a[i]<<" ";
//     }
// }
int* shellSort(int a[], int n)
{
    for (int gap = n / 2; gap > 0; gap /= 2)
    {
        for (int i = gap; i < n; i++)
        {
            for(int j=i-gap;j>=0;j-=gap)
            {
                if(a[j]>a[j+gap])
                {
                   swap(a[j],a[j+gap]);
                }
                else
                {
                    break;
                }
                
            }
        }
    }
    return a;
}
int main()
{
    int a[10];
    for (int i = 0; i < 10; i++)
    {
        cin >> a[i];
    }

    int *arr = shellSort(a, 10);
    for (int i = 0; i < 10; i++)
    {
        cout << a[i] << " ";
    }
    return 0;
}


