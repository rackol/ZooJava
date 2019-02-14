public class Animal{
    String name;
    String favoriteFood;
    public Animal(String name, String favoriteFood){
        this.name=name;
        this.favoriteFood=favoriteFood;
    }
    public void sleep(){
        this.sleep();
    }
    public void eat(String food){
        System.out.println(name+" eats "+food+" ");
        if(food==favoriteFood){
            System.out.println("Yumm!!! "+name+" wants more "+ food);
        }else{
            this.sleep();
        }
    }
}
