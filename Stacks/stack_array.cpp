#include<iostream>
using namespace std;

int top = -1;
void push(int stack[], int x, int n){
    if(top == n-1){
        cout<<"\nOVERFLOW";
    }
    else{
        top = top +1;
        stack[top] = x;
    }
}

bool isEmpty(){
    if(top==-1){
        return true;
    }else{
        return false;
    }
}

void pop(){
    if(isEmpty()){
        cout<<"\nUNDERFLOW";
    }else{

        top = top-1;
    }
}

int size(){
    return top+1;
}

int topElement(int stack[]){
    return stack[top];
}

void print(int stack[]){

    for(int i=0;i<=top;i++)
        cout<<stack[i]<" ";
    cout<<endl;
}

int main(){
    int stack[10];
    push(stack, 5, 10);
    print(stack);
    return 0;
}