#include<iostream>
using namespace std;
int main(){
    int list[]={4,1,2,3,4,5,5,6,8,9,7,4};
    int size=sizeof(list)/sizeof(list[0]);
    int no=0;
    int pairs=7;
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            for(int k=j+1;k<size;k++){
                if(list[i]+list[j]+list[k]==pairs){
                 int a=list[i],b=list[j],c=list[k];
                 cout<<"("<<a<<","<<b<<","<<c<<")"<<endl;
                 no++;
                }
            }
        }
    }cout<<"no of pairs: "<<no<<endl;
    return 0;
}