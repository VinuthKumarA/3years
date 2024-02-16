#include<iostream>
using namespace std;
int largestint1(int array[],int size){
    int max=array[0];
    int index=0;
    for(int i=0;i<size;i++){
        if(array[i]>max){
            max=array[i];
            index=i;
        }
    }
    return  index; 
}

int main(){
    int array[]= {2, 3, 5, 7, 6, 1, 9};
    int size=sizeof(array)/sizeof(array[0]);
    
    int largestint=largestint1(array,size);
    array[largestint]=-1;
    int largestinteger=largestint1(array,size);
    cout<<array[largestinteger];
    return 0;
}