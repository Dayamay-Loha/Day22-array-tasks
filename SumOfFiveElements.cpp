#include<iostream>
using namespace std;

int sumOfEle(int arr[], int n){
    int totalSum = 0;
    for(int i = 0; i<n; i++){
        totalSum += arr[i];
    }

    return totalSum;
}

int main(){
    int arr[100];
    int n;
    cout<<"Enter the number of elements : ";
    cin>>n;
    for(int i = 0; i<n; i++){
        cin>>arr[i];
    }

    cout<<sumOfEle(arr, n);
}