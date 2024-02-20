#include<iostream>
using namespace std;    ///moving the zeros to end
int pushtoend(int list[],int size){
    int count=0;
    for(int i=0;i<size;i++){
    if(list[i]!=0){
         list[count++]=list[i];
    }
   }
   while(count<size){
        list[count++]=0;
   }
   return list[count];
}
int main(){
    int list[]={1,2,3,0,33,0,2,0,0,3,0};
    int size=sizeof(list)/sizeof(list[0]);
    int call=pushtoend(list,size);
    for(int i=0;i<size;i++){
     cout<<list[i]<<",";
    }
    return 0;
}