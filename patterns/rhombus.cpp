#include<iostream>
using namespace std;
int main(){
    int a;
    cout<<"enter the order: ";cin>>a;
    for(int i=a;i>=1;i--){
        for(int j=1;j<=a-i;j++){
            cout<<" ";
        }
        for(int j=1;j<=a;j++){
            cout<<"*";
        }cout<<endl;
    }
    return 0;
}