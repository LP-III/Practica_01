#include <iostream>
using namespace std;

int sumaArreglo (int arr[], int n) {
    int suma = 0;
    for (int i = 0; i < n; i++)
        suma += arr[i];
    }
    return suma;

int main() {
    int numeros[] = {1, 2, 3, 4, 5};
    int n = sizeof(numeros) / sizeof (numeros[0]);
    cout << sumaArreglo (numeros, n) << endl;
    return 0;
}