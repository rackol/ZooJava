public class Bear extends Animal{
    String favoriteFood;
    public Bear(String name){
        super(name,"fish");
    }
    public void sleep(){
        System.out.println(name+" hybernates for 4 months");
    }
}
