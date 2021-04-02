#include <iostream>
using namespace std;

int main() {
 
 double num1, num2;
 char op;
 
 cout << "Enter First Number: ";
 cin >> num1;
 
 cout << "Enter an Operator: ";
 cin >> op;
 
 cout << "Enter Second Number: ";
 cin >> num2;
 
 double result;
 
 if (op == '+') {
 result = num1 + num2;
 } else if (op == '-') {   
    result = num1 - num2;
 } else if (op == '/') {   
    result = num1 / num2;
 } else if (op == '*') {   
    result = num1 * num2;
 } else {
     cout << "Invalid Operator!"; 
 }
  cout << result; 
}
