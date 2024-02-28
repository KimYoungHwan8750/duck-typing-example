class Duck{
    cry(){
        return 'quack-quack'
    }
}

class Chick{
    cry(){
        return 'wing-chicken';
    }
}

function howDoesACry(animal){
    console.log(animal.constructor.name + '은 ' + animal.cry())
}

howDoesACry(new Duck())
howDoesACry(new Chick())