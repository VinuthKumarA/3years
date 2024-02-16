#include<iostream>
using namespace std;
int main(){
    int mylist[]={8200,4,457,7775,4,4,3};
    int size=sizeof(mylist)/sizeof(mylist[0]);
    int maxvalue=mylist[0];
    for(int i=0;i<size;i++){
        if(mylist[i]>maxvalue){
            maxvalue=mylist[i];
        }
    }cout<<maxvalue;
    return 0;
}