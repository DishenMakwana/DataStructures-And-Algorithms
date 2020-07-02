#include <bits/stdc++.h>
using namespace std;

int* countingSort(int a[], int n)
{
    int max = a[0];
    int output[n];

    for (int i = 1; i < n; i++)
    {
        if (a[i] > max)
        {
            max = a[i];
        }
    }
    // cout<< max <<" ";
    int ct[max + 1];
    for (int i = 0; i <= max; i++)
    {
        ct[i] = 0;
    }
    for (int i = 0; i < n; i++)
    {
        ct[a[i]]++;
    }
    for (int i = 1; i < max + 1; i++)
    {
        ct[i] += ct[i - 1];
    }

    for (int i = n - 1; i >= 0; i--)
    {
        output[--ct[a[i]]] = a[i];
    }
    for (int i = 0; i < n; i++)
    {
        a[i]=output[i];
    }
    return a;
}

int main()
{

    int a[5];
    for (int i = 0; i < 5; i++)
    {
        cin >> a[i];
    }
    //countingSort(a, 5);
    int *ans = countingSort(a, 5);
    for (int i = 0; i < 5; i++)
    {
        /* code */
        cout << ans[i] << " ";
    }
}
