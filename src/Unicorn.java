public class Unicorn extends Animal{
    String favoriteFood;
    public Unicorn(String name){
        super(name,"Marshmallows");

    }
    public void sleep(){
        System.out.println(name+" sleeps in a cloud");
    }
    public void eat(String food){
        System.out.println(name+" eats "+food+" ");
        if(food==favoriteFood){
            System.out.println("Yumm!!! "+name+" wants more "+ food);
            super.sleep();
        }
    }
}
//doesnt sleep after easting Marshmallows
