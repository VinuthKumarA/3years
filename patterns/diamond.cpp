#include<iostream>
using namespace std;
int main(){
    int a;
    cout<<"enter the order: ";cin>>a;
    for(int i=0;i<=a;i++){
        for(int j=1;j<=a-i;j++){
            cout<<" ";
        }
        for(int j=1;j<=2*i-1;j++){
            cout<<"*";
        }cout<<endl;
    }


    for(int i=a-1;i>=1;i--){
        for(int j=1;j<=a-i;j++){
            cout<<" ";
        }
        for(int j=1;j<=2*i-1;j++){
            cout<<"*";
        }cout<<endl;
    }
    return 0;
}