abstract class parent{//we cannot make object of abstract class
    public parent(){
        System.out.println("i am constructor of parent");

    }
    abstract public void greet();//no implemantaion of this method //but it is compulsory for base class to inherit this method
}

class child extends parent{
    public void greet(){//if dont write this method it will show error
        System.out.println("Good morning");
    }
}


public class abstract_example {
    public static void main(String[] args){
 //   parent p=new parent();  //we cannot make object of abstract class
    child c=new child();
   //c.parent();
    c.greet();
}
}