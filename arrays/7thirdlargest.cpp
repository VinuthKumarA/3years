#include<iostream>
using namespace std;  ///third largest no
int order1(int list[],int size){
    int max=0;
    int index=0;
    for(int i=0;i<size;i++){
        if(list[i]>max){
            max=list[i];
            index=i;
        }
    }
    return index;
}
int main(){
    int list[]={2,7,3,4,5,3,1,8,4,3,9,99};
    int size=sizeof(list)/sizeof(list[0]);
    int order=order1(list,size);
    list[order]=-1;
    int order2=order1(list,size);
    list[order2]=-1;
    int order3=order1(list,size);
    cout<<list[order3];


    return 0;
}