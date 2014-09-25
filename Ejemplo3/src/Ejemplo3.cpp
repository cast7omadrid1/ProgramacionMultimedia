//============================================================================
// Name        : Ejemplo3.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================


#include <iostream>
#include <fstream>
#include <cstring>
#include <stdlib.h>
using namespace std;

// Definir la estructura del registro que se va a almacenar
struct registro{
	char nombre[32];
	int edad;
	float altura;
};


int main() {
	registro persona, persona1;

	//Abrir un stream de salida para añadir registros al final
	ofstream fsalida("c:\\datos\\personas.dat", ios::out | ios::binary | ios::app);
	strcpy(persona.nombre, "Andres");
	persona.edad=30;
	persona.altura=1.70;

	// Escribir en el fichero
	fsalida.write(reinterpret_cast<char*>(&persona), sizeof(registro));
	fsalida.close();

	//Abrir un stream de entrada para leer el fichero
	ifstream fentrada("c:\\datos\\personas.dat", ios::in|ios::binary);

	//Leer en el fichero
	fentrada.read(reinterpret_cast<char*>(&persona1), sizeof(registro));
	while (!fentrada.eof())
	{
		cout << persona1.nombre << " " << persona1.edad << " " << persona1.altura << endl;
		fentrada.read(reinterpret_cast<char*>(&persona1), sizeof(registro));
	}
	fentrada.close();
	system("pause");
	return 0;
}
