#include<iostream>
using namespace std;
int main(){
    int a;
    cout<<"enter the row order: ";cin>>a;
    for(int i=1;i<=a;i++){
        for(int j=0;j<i;j++){
                cout<<"*";
        }
        cout<<endl;
    }
    return 0;
}