#include <iostream>
using namespace std;

struct Node
{
    int data;
    Node* next;
};

Node* head = NULL;

void insertFront(int x)
{
    Node* p = new Node;
    p->data = x;
    p->next = head;
    head = p;
}

void insertEnd(int x)
{
    Node* p = new Node;
    p->data = x;
    p->next = NULL;

    if(head == NULL)
    {
        head = p;
        return;
    }

    Node* t = head;

    while(t->next != NULL)
        t = t->next;

    t->next = p;
}

void insertAfter(int key, int x)
{
    Node* t = head;

    while(t != NULL && t->data != key)
        t = t->next;

    if(t == NULL)
        return;

    Node* p = new Node;
    p->data = x;
    p->next = t->next;
    t->next = p;
}

void deleteFront()
{
    if(head == NULL)
    {
        cout << "List is Empty\n";
        return;
    }

    Node* t = head;
    head = head->next;
    delete t;
}

void deleteEnd()
{
    if(head == NULL)
    {
        cout << "List is Empty\n";
        return;
    }

    if(head->next == NULL)
    {
        delete head;
        head = NULL;
        return;
    }

    Node* t = head;

    while(t->next->next != NULL)
        t = t->next;

    delete t->next;
    t->next = NULL;
}

void deleteValue(int key)
{
    if(head == NULL)
    {
        cout << "List is Empty\n";
        return;
    }

    if(head->data == key)
    {
        deleteFront();
        return;
    }

    Node* t = head;

    while(t->next != NULL && t->next->data != key)
        t = t->next;

    if(t->next != NULL)
    {
        Node* p = t->next;
        t->next = p->next;
        delete p;
    }
}

void display()
{
    if(head == NULL)
    {
        cout << "List is Empty\n";
        return;
    }

    Node* t = head;

    while(t != NULL)
    {
        cout << t->data << " ";
        t = t->next;
    }

    cout << endl;
}

void searchList(int x)
{
    Node* t = head;
    int pos = 1;

    while(t != NULL)
    {
        if(t->data == x)
        {
            cout << "Found at position " << pos << endl;
            return;
        }

        t = t->next;
        pos++;
    }

    cout << "Not Found\n";
}

void reverseList()
{
    Node* prev = NULL;
    Node* curr = head;
    Node* next = NULL;

    while(curr != NULL)
    {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }

    head = prev;
}

void bubbleSort(int a[], int n)
{
    for(int i = 0; i < n-1; i++)
    {
        for(int j = 0; j < n-i-1; j++)
        {
            if(a[j] > a[j+1])
            {
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
    }
}

void selectionSort(int a[], int n)
{
    for(int i = 0; i < n-1; i++)
    {
        int min = i;

        for(int j = i+1; j < n; j++)
        {
            if(a[j] < a[min])
                min = j;
        }

        int temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }
}

void insertionSort(int a[], int n)
{
    for(int i = 1; i < n; i++)
    {
        int key = a[i];
        int j = i-1;

        while(j >= 0 && a[j] > key)
        {
            a[j+1] = a[j];
            j--;
        }

        a[j+1] = key;
    }
}

void countingSort(int a[], int n)
{
    int count[101] = {0};

    for(int i = 0; i < n; i++)
        count[a[i]]++;

    int k = 0;

    for(int i = 0; i <= 100; i++)
    {
        while(count[i] > 0)
        {
            a[k] = i;
            k++;
            count[i]--;
        }
    }
}

void countingSortRadix(int a[], int n, int exp)
{
    int output[300];
    int count[10] = {0};

    for(int i = 0; i < n; i++)
        count[(a[i] / exp) % 10]++;

    for(int i = 1; i < 10; i++)
        count[i] = count[i] + count[i-1];

    for(int i = n-1; i >= 0; i--)
    {
        int digit = (a[i] / exp) % 10;
        output[count[digit] - 1] = a[i];
        count[digit]--;
    }

    for(int i = 0; i < n; i++)
        a[i] = output[i];
}

void radixSort(int a[], int n)
{
    int max = a[0];

    for(int i = 1; i < n; i++)
    {
        if(a[i] > max)
            max = a[i];
    }

    for(int exp = 1; max / exp > 0; exp = exp * 10)
        countingSortRadix(a, n, exp);
}

void dutchSort(int a[], int n)
{
    int low = 0;
    int mid = 0;
    int high = n-1;

    while(mid <= high)
    {
        if(a[mid] == 0)
        {
            int temp = a[low];
            a[low] = a[mid];
            a[mid] = temp;

            low++;
            mid++;
        }
        else if(a[mid] == 1)
        {
            mid++;
        }
        else
        {
            int temp = a[mid];
            a[mid] = a[high];
            a[high] = temp;

            high--;
        }
    }
}

void linearSearch(int a[], int n, int x)
{
    for(int i = 0; i < n; i++)
    {
        if(a[i] == x)
        {
            cout << "Found at position " << i+1 << endl;
            return;
        }
    }

    cout << "Not Found\n";
}

void binarySearch(int a[], int n, int x)
{
    int low = 0;
    int high = n-1;

    while(low <= high)
    {
        int mid = (low + high)/2;

        if(a[mid] == x)
        {
            cout << "Found at position " << mid+1 << endl;
            return;
        }

        if(a[mid] < x)
            low = mid+1;
        else
            high = mid-1;
    }

    cout << "Not Found\n";
}

void printArray(int a[], int n)
{
    for(int i = 0; i < n; i++)
        cout << a[i] << " ";

    cout << endl;
}

int main()
{
    int choice;

    do
    {
        cout << "\n1 Insert Front";
        cout << "\n2 Insert End";
        cout << "\n3 Insert After";
        cout << "\n4 Delete Front";
        cout << "\n5 Delete End";
        cout << "\n6 Delete Value";
        cout << "\n7 Display List";
        cout << "\n8 Search List";
        cout << "\n9 Reverse List";
        cout << "\n10 Linear Search";
        cout << "\n11 Binary Search";
        cout << "\n12 Bubble Sort";
        cout << "\n13 Selection Sort";
        cout << "\n14 Insertion Sort";
        cout << "\n15 Counting Sort";
        cout << "\n16 Dutch National Flag Sort";
        cout << "\n17 Radix Sort";
        cout << "\n0 Exit\n";

        cin >> choice;

        int x, key, n;

        if(choice == 1)
        {
            cin >> x;
            insertFront(x);
        }

        else if(choice == 2)
        {
            cin >> x;
            insertEnd(x);
        }

        else if(choice == 3)
        {
            cin >> key >> x;
            insertAfter(key, x);
        }

        else if(choice == 4)
        {
            deleteFront();
        }

        else if(choice == 5)
        {
            deleteEnd();
        }

        else if(choice == 6)
        {
            cin >> x;
            deleteValue(x);
        }

        else if(choice == 7)
        {
            display();
        }

        else if(choice == 8)
        {
            cin >> x;
            searchList(x);
        }

        else if(choice == 9)
        {
            reverseList();
        }

        else if(choice >= 10 && choice <= 17)
        {
            cin >> n;

            int a[300];

            for(int i = 0; i < n; i++)
                cin >> a[i];

            if(choice == 10)
            {
                cin >> x;
                linearSearch(a, n, x);
            }

            else if(choice == 11)
            {
                cin >> x;
                binarySearch(a, n, x);
            }

            else if(choice == 12)
            {
                bubbleSort(a, n);
                printArray(a, n);
            }

            else if(choice == 13)
            {
                selectionSort(a, n);
                printArray(a, n);
            }

            else if(choice == 14)
            {
                insertionSort(a, n);
                printArray(a, n);
            }

            else if(choice == 15)
            {
                countingSort(a, n);
                printArray(a, n);
            }

            else if(choice == 16)
            {
                dutchSort(a, n);
                printArray(a, n);
            }

            else if(choice == 17)
            {
                radixSort(a, n);
                printArray(a, n);
            }
        }

    } while(choice != 0);

    return 0;
}