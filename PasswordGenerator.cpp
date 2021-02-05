#include <iostream>

#include <stdlib.h> 

using namespace std;

void Generate (int len) {

   int pull;

   string characters = "@#$%&0123456789qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";

   for (int i=0; i<len; i++) {

   pull = rand() % characters.length();

   cout << characters[pull];

   }

}

int main()

{   int len;

    int choice;

    cout << "\nEnter Your Choice\n";

    cout << "Press 1 to Get Password\n";

    cout << "Press 2 to Exit\n";

    cin >> choice;

    if (choice == 1) {

        cout << "Enter Length Of The Password: " ;

        cin >> len ;

        Generate(len);

        main ();

    } else if (choice == 2) {

        return (0);

    } else {

        cout << "Oops! Something Went Wrong Tryagain!\n" ;

        main ();

    }

}
