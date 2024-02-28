interface Animal{
    public String cry();
}

class Duck implements Animal{
    @Override
    public String cry(){
        return "quack-quack";
    }
}

class Chick implements Animal{
    @Override
    public String cry(){
        return "wing-chicken";
    }
}

class DuckTyping {
    public static void howDoesACry(Animal animal){
        String animalName = animal.getClass().getName();
        System.out.println(animalName + "은 " + animal.cry());
    }
    public static void main(String[] args) {
        Animal duck = new Duck();
        Animal chick = new Chick();
        howDoesACry(duck);
        howDoesACry(chick);
    }
}

