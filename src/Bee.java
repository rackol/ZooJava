public class Bee extends Animal{
    String favoriteFood;
    public Bee(String name){
        super(name,"pollen");

    }
    public void sleep(){
        System.out.println(name+" never sleeps");
    }
    public void eat(String food){
        System.out.println(name+" eats "+food+" ");
        if(food==favoriteFood){
            System.out.println("Yumm!!! "+name+" wants more "+ food);
            super.sleep();
        }else{
            System.out.println(name+" will not eat "+food);
        }
    }
}
//doesnt sleep or complain correctly