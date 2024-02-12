#include<iostream>
using namespace std;
int main(){
    int a,b;
    cout<<"enter the rows order: ";cin>>a;
    cout<<"enter the column order: ";cin>>b;
    for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            cout<<"*";
        }
        cout<<endl;
    }
    return 0;
}