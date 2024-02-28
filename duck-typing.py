class Duck :
    def cry(self):
        return "quack-quack"
class Chick :
    def cry(self):
        return "wing-chicken"
    
def howDoesACry(animal):
    animalName = animal.__class__.__name__
    sound = animal.cry()
    print("{}은 {}".format(animalName,sound))

howDoesACry(Duck())
howDoesACry(Chick())