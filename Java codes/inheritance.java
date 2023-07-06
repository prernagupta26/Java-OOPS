class Base{
    public int x;
    public int getx(){
        System.out.println(x);
        return x;
    }

    public void setx(int x){
        this.x=x;
    }
}


class Derived extends Base{
    public int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
    }
}

public class inheritance {
    public static void main(String[] args){
        Base b=new Base();
        b.setx(26);
        System.out.println(b.getx());

        Derived d=new Derived();
        d.sety(6);
        System.out.println(d.gety());

        d.setx(1);    //we can call base class methods from derived class objects
        d.getx();
}
}
