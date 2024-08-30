public class fish extends Animal{
    public fish(String name){
        super(name);
   }

    @Override
    public void move() {
        System.out.println(name + "swim");
    }

    @Override
    public void sound() {
        System.out.println(name +"cannot make sound");
    }
        
    }

    



