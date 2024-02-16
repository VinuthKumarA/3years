#include<iostream>
using namespace std;
int main(){
    int list[]={3,4,6,7,1};
    int size=sizeof(list)/sizeof(list[0]);
    int pair=7;
    int a=0,b=0;
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            if(list[i]+list[j]==pair){
             a=list[i],b=list[j] ;
             cout<<"("<<a<<","<<b<<")"<<endl;
            }
        }
    }
    return 0;
}