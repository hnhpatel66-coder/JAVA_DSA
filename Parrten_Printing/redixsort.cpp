#include <iostream>
using namespace std;

// Counting Sort for each digit
void countingSort(int arr[], int n, int place)
{
    int min = 0;
    int max = 9;

    int range = max - min + 1;
    int count[range] = {0};
    int output[n];

    // Count digit frequency
    for (int i = 0; i < n; i++)
    {
        int digit = (arr[i] / place) % 10;
        count[digit - min]++;
    }

    // Cumulative count
    for (int i = 1; i < range; i++)
    {
        count[i] = count[i] + count[i - 1];
    }

    // Create output
    for (int i = n - 1; i >= 0; i--)
    {
        int digit = (arr[i] / place) % 10;

        output[count[digit - min] - 1] = arr[i];
        count[digit - min]--;
    }

    // Copy back
    for (int i = 0; i < n; i++)
    {
        arr[i] = output[i];
    }
}

// Radix Sort
void radixSort(int arr[], int n)
{
    int min = arr[0];
    int max = arr[0];

    // Find minimum and maximum
    for (int i = 1; i < n; i++)
    {
        if (arr[i] < min)
            min = arr[i];

        if (arr[i] > max)
            max = arr[i];
    }

    cout << "Minimum = " << min << endl;
    cout << "Maximum = " << max << endl;

    // Sort digit by digit using maximum
    for (int place = 1; max / place > 0; place *= 10)
    {
        countingSort(arr, n, place);
    }
}

int main()
{
    int n;

    cout << "Enter number of elements: ";
    cin >> n;

    int arr[n];

    cout << "Enter elements: ";

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    radixSort(arr, n);

    cout << "Sorted Array: ";

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }

    return 0;
}