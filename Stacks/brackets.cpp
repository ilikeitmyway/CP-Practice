//Consider the balanced parentheses problem.

#include<iostream>
using namespace std;

int top;
void check(char str[], int n, char stack[]){
    for(int i=0;i<n;i++){
        if(str[i] == '('){
            top = top +1;
            stack[top] = '(';
        }
        if(str[i]==')'){
            if(top == -1){
                top = top-1;
                break;
            }else{
                top = top - 1;
            }
        }
    }
    if(top == -1){
        cout<<"Balanced String"<<endl;
    }else{
        cout<<"Unbalanced String"<<endl;
    }
}

int main(){
    char str[]= {'a',')','(','b'};
    char stack[15];
    top = -1;
    check(str, 4, stack);
}