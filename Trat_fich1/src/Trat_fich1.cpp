//============================================================================
// Name        : Trat_fich1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <fstream>//Biblioteca para el manejo de ficheros
#include <cstdlib>//Biblioteca estándar
#include <string.h>
using namespace std;


struct mialumno{
	int clase;//numero de registro donde almacena
	char apellido[25];//apellidos del alumno
	float nota1;//nota primera eval
	float nota2;//idem segunda
	float nota3;//idem tercera
};

int main() {

	mialumno alumno;//variable de estructura
	int elegir;//para menu
	int numReg;//para buscar el numero de registro

	//creación del string de nombres
	string nombres[5]={"juan","Miguel","María","Andrés","Julia"};

	//creación del archivo "ejercicio1.dat"
	fstream alumnos;//entrada y salida
	alumnos.open("c:\\datos\\ejercicio1.txt",ios::out|ios::binary);//salida,abrir en binario

	cout<<"\tMenu"<<endl;
	cout<<"-----------------------"<<endl;

	cout<<"2-BUSCAR"<<endl;

	cin>>elegir;

	if(elegir == 2){

						cout<<"Indique el número de registro del alumno que desee buscar: ";
						cin>>numReg;
	}

	//crear registros

	for(int i=0;i<10;i++){
		alumno.clase=i;
		strcpy(alumno.apellido,nombres[rand()%4].c_str());
		alumno.nota1=rand()%10;
		alumno.nota2=rand()%10;
		alumno.nota3=rand()%10;

		//ver alumno
		cout<< alumno.clase<<endl;
		cout<< alumno.apellido<<endl;
		cout<< alumno.nota1 <<endl;
		cout<< alumno.nota2<<endl;
		cout<< alumno.nota3 <<endl;

		//escribirlo en el fichero
		alumnos.write(reinterpret_cast<char*>(&alumno),sizeof(mialumno));
		alumnos.close();

	}
	/*
	//Abrir un stream de entrada para leer el fichero
	ifstream entrada("c:\\datos\\ejercicio1.txt",ios::out|ios::binary);//entrada

	//leer en el fichero
	entrada.read(reinterpret_cast<char*>(&alumno),sizeof(mialumno));

	while(!entrada.eof()){

			 if(numReg == alumno.clase ){

				 cout<< alumno.clase<<endl;
				 cout<< alumno.apellido<<endl;
				 cout<< alumno.nota1 <<endl;
				 cout<< alumno.nota2<<endl;
				 cout<< alumno.nota3 <<endl;
				 entrada.read(reinterpret_cast<char*>(&alumno),sizeof(mialumno));
			}
	}


			entrada.close();
			 system("pause");
*/
	return 0;
}
