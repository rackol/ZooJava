public class Zoo {
    String favoriteFood="meat";
    public static void main(String[]args){
        Zoo zoo=new Zoo();
        zoo.sleep("Tigger");
        zoo.eat("Tigger","meat");
        zoo.eat("Tigger","Leaves");
    }

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }
    public void eat(String name, String food){
        System.out.println(name+" eats "+food+" ");
        if(food==favoriteFood){
            System.out.println("Yumm "+name+" wants more "+food+" ");
        }
    }

}

