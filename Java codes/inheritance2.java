class Animal{
    public void eat(){
        System.out.println("eats anything");
    }
    public void legs(){
        System.out.println("has 4 legs");
    }
}

class Goat extends Animal{
    public void eat(){
        System.out.println("eats grass");
    }
    public void colour(){
        System.out.println("white");
    }
}


public class inheritance2 {
    public static void main(String[] args){
        //Animal a =new Animal();
        //a.eat();

        Goat g=new Goat();
        g.eat();
        g.legs();
        g.colour();   //allowed
        
        Animal a=new Goat();
        a.eat();
        a.legs();
        //a.colour();-->not allowed because reference is of animal class
    }
}
