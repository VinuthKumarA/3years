#include<iostream>
using namespace std;
int main(){
    int a;
    cout<<"enter the order: ";cin>>a;
    for(int i=a;i>=1;i--){
        for(int j=1;j<=a-i;j++){
            cout<<" ";
        }
        for(int j=1;j<=2*i-1;j++){
            if(i==a||i==1||j==1||j==2*i-1){
                cout<<"*";
            }else{
                cout<<" ";
            }
        }cout<<endl;
    }


    for(int i=2;i<=a;i++){
        for(int j=1;j<=a-i;j++){
            cout<<" ";
        }
        for(int j=1;j<=2*i-1;j++){
            if(i==a||i==1||j==1||j==2*i-1){
                cout<<"*";
            }else{
                cout<<" ";
            }
        }cout<<endl;
    }
    return 0;
}