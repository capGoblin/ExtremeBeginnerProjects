#include <iostream>
using namespace std;
   
int main () {
    string username, password;
    
    string inpUsername, inpPassword;

   cout << "Welcome newUser!\n";

   cout << "Enter Your Username\n";
   cin >> username;

   cout << "Enter Your Password\n";  
   cin >> password;

   cout << "Successfully Registered! Please Login!\n";


   cout << "Username:\n";
   cin >> inpUsername;

   cout << "Password:\n";
   cin >> inpPassword;

   if (inpUsername == username && inpPassword == password) {

          cout << "Successfully Logined! Loading to Your Dashboard! Patience Please!\n";

   } else {

       cout << "Oops! Error While Login! Please Try Again Later!";
   }

}
