def mostrar_menu():
    print("1.Personas")
    print("2.Vehiculos")
    print("3.Universidades")
    print("4.Notas")
    print("5.Salir")

mostrar_menu()

config = int(input("Digita un numero del menu de opciones:"))

if config == 1:
    print("Elegiste la opcion Personas")
elif config == 2:
    print("Elegiste la opcion Vehiculos, Supraaaaaaaaaaaa")
elif config == 3:
    print("Elegiste la opcion Universidades, UnitecnZzzzz")
elif config == 4:
    print("Elegiste la opcion Notas, Peldiste  1.0")
elif config == 5:
    print("Elegiste la opcion salir, salte de esto")
    mostrar_menu()
else:
    print("Es del 1 al 5 😡")
