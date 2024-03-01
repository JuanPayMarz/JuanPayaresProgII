class lote:
    
    def __init__(self, largo, ancho, constuctora):
        
        self.largo = largo
        self.ancho = ancho
        self.constructora = constuctora
        
        def calcular_area(largo,ancho):
            
            x = largo * ancho
            
            
def printlote(self):

   print(self.largo,self.ancho,self.constuctora)
            
            

class casita (lote):
    
    def __init__(self, largo, ancho, constuctora, propietario, telefono):
        
        self.propietario = propietario
        self.telefono = telefono
        
        super().__init__(largo, ancho, constuctora)               
        
        c = casita (1000,500, "los olivos", "Payares", "300500089")
        c.printlote()
        