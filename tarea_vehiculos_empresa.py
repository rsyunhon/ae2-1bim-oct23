class Vehiculos:
    def __init__(self):
	self.vehiculo= []

    def add_vehiculo(self, placa, propietario, cantOcup, marca, modelo, ayear):
	vehiculo = {"placa": placa, "propietario": propietario, "marca": marca, "modelo": modelo, "A o_Fabricacion": ayear}
        self.tasks.append(vehiculo)
        print(f'Vehiculo "{task}" agregada a la lista.')

    def listar_vehiculos(self):
       for index, vehiculo in enumerate(self.vehiculo, start=1):
            print(f"Veh culo {index}: Placa: {vehiculo['placa']}, Marca: {vehiculo['marca']}, Modelo: {vehiculo['modelo']}")


    def rem_vehiculo(self, placa):
        for vehiculo in self.vehiculo:
            if vehiculo["placa"] == placa:
                self.vehiculo.remove(vehiculo)
                print(f"Vehiculo con placa {placa} eliminado de la Lista.")
                break
        else:
            print(f"No se encontr  ning n veh culo con la placa {placa}.")

  def mod_vehiculo(self, placa, propietario, marca, modelo, ayear):
        for vehiculo in self.vehiculo:
            if vehiculo["placa"] == placa:
		vehiculo["propietario"]== propietario
                vehiculo["marca"] = marca
                vehiculo["modelo"] = modelo
		vehiculo["A o_Fabricacion"]== ayear
                print(f"Veh culo con placa {placa} modificado.")
                break
        else:
            print(f"No se encontr  ning n veh culo con la placa {placa}.")



class Empresa
    def __init__(self):
	self.empresa= []

    def add_empresa(self, nombre, direccion, ciudad):
	empresa = {"nombre": nombre, "direccion": direccion, "ciudad": ciudad}
        self.tasks.append(empresa)
        print(f'Empresa "{task}" agregada a la lista.')

    def listar_empresa(self):
       for index, empresa in enumerate(self.empresa, start=1):
            print(f"Nombre {index}: Direccion: {empresa['direccion']}, Ciudad: {empresa['ciudad']}")


    def rem_empresa(self, nombre):
        for empresa in self.empresa:
            if empresa["Nombre_Empresa"] == nombre:
                self.empresa.remove(empresa)
                print(f"La empresa {placa}  has sido eliminado de la Lista.")
                break
        else:
            print(f"No se encontr  ning n empresa con la el nombre {nombre}.")

  def mod_empresa(self, nombre, direccion, ciudad):
        for empresa in self.empresa:
            if empresa["nombre"] == nombre:
		empresa["direccion"]== direccion
                empresa["ciudad"] = ciudad
                print(f"La empresa con el nomnbre {nombre} ha sido modificado.")
                break
        else:
            print(f"No se encontr  ninguna empresa con la el nombre {nombre}.")


def main():
    vehiculos_cl = Vehiculos()
    empresa_cl = Empresa() 

    while True:
        print("\nMenu Opciones:")
	  print("****************")
	  print("\n")
        print("1. Agregar Vehiculo")
        print("2. Ver Vehiculo")
        print("3. Eliminar Vehiculo")
	print("4. Modificar Vehiculo")
        print("5. Agregar Empresa")
        print("6. Ver Empresa")
        print("7. Eliminar Empresa")
	print("8. Modificar Empresa")
        print("9. Salir")

        choice = input("Seleccione una opci n: ")

        if choice == "1":
            placa = input("Ingrese la placa: ")
	    propietario = input("Ingrese el nombre del Propietario: ") 
	    cantOcup =  input("Ingrese la cantidad de Ocupantes del Vehiculo: ")
            marca = input("Ingrese la marca del vehiculo: ") 
	    modelo = input("Ingrese el modelo de vehiculo: ") 
	    ayear = input("Ingrese el a o de Fabricacion: ")
            vehiculos_cl.add_vehiculo() 
        elif choice == "2":
            vehiculos_cl.listar_vehiculos()
        elif choice == "3":
            vehiculos_cl.listar_vehiculos()
            placa = input("Digite La placa del vehiculo a eliminar: ")
            vehiculos_cl.rem_vehiculo(placa)
        elif choice == "4":
	    placa = input("Ingrese la placa del veh culo a modificar: ")
	    propietario = input("Ingrese el nuevo nombre del Propietario: ") 
	    cantOcup =  input("Ingrese la nueva cantidad de Ocupantes del Vehiculo: ")
            marca = input("Ingrese la nueva marca del vehiculo: ") 
	    modelo = input("Ingrese el nuevo modelo de vehiculo: ") 
	    ayear = input("Ingrese el nuevo a o de Fabricacion: ")
	    vehiculos_cl.mod_vehiculo(placa, propietario, cantOcup, marca, modelo, ayear)
        elif choice == "5":
            nombre = input("Ingrese el nombre: ")
	    direccion = input("Ingrese la direccion de la: ") 
	    ciudad =  input("Ingrese la ciudad: ")
            empresa_cl.add_empresa
	elif choice == "6":
            empresa_cl.listar_empresa()
	elif choise == "7":
	    empresa_cl.listar_empresa()
	    empresa = input("Escriba el nombre de la empresa eliminar: ")
      	    empresa_cl.rem_empresa(empresa)
	elif choise =="8"
	    empresa = input("Ingrese el nombre la empresa a modificar: ")
	    direccion = input("Ingrese el nuevo nombre del Propietario: ") 
	    ciudad =  input("Ingrese la nueva cantidad de Ocupantes del Vehiculo: ")
	    empresa_cl.mod_empresa(empresa, direccion, ciudad)
        else:
            print("Opci n no v lida. Por favor, elija una opci n v lida.")

if __name__ == "__main__":
    main()
