#include<iostream>
using namespace std;
int main(){
    int mylist[]={2,3,4,5,6,5,1};
    int size=sizeof(mylist)/sizeof(mylist[0]);
    int minvalue=mylist[0];

    for(int i=0;i<size;i++){
        if(mylist[i]<minvalue){
            minvalue=mylist[i];
        }
    }cout<<minvalue;
    return 0;
}