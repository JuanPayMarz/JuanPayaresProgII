lista_vacia = []

lista = ["Juan" , "Payares" , "PM" , "Apfel" , "Nepal" , "Dangerous" , "Deutchland"]

print(len(lista_vacia))

print(len(lista))

print("La longitud de la lista es: ", len(lista))

print("El primer elemento de la lista es: ", lista[0])

print("El quinto elemento de la lista es: ", lista[5])

print("El ultimo elemento de la lista es: ", lista[6])

Datos_personales = ["Juann","20","Soltero","1.78","Mz9 Lt15"]
Datos_personales.append("Cartacho")

print(Datos_personales)

it_companies = ["Facebook", "Google", "Microsoft", "Apple", "IBM", "Oracle", "Amazon" ]

it_companies.insert(0,"Cocacola")

if "Faceboock" in it_companies:
    print(True)

it_companies.sort()

print(it_companies)

it_companies.pop(2)

print(it_companies)

it_companies.clear

print (it_companies)