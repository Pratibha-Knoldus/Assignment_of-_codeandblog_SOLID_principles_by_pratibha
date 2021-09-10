interface Animal {
    void properties();
}

interface Horns {
    void hornsProps();
}

interface Tail {
    void tailProps();
}

class Dog implements Animal, Tail {

    public void properties(){
        System.out.println("Woof! Dog Voice provided");
    }
    public void tailProps(){
        System.out.println("A medium tail has provided");
    }
}

 class Cow implements Animal, Horns, Tail {
     public void properties(){
         System.out.println("Moo! Cow Voice provided");
     }

     public void hornsProps(){
         System.out.println("2 Horns has provided");
     }

     public void tailProps(){
         System.out.println("A long tail has provided");
     }
 }


public class ISPAnimal{

    public static void main(String []args){
        Dog dog = new Dog();
        dog.properties();
        dog.tailProps();
        Cow cow = new Cow();
        cow.properties();
        cow.hornsProps();
        cow.tailProps();
    }
}

