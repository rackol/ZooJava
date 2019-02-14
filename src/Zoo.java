public class Zoo {
    String favoriteFood="meat";
    String name;

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }
    public void eat(String name, String food){
        System.out.println(name+" eats "+food+" ");
        if(food==favoriteFood){
            System.out.println("Yumm "+name+" wants more "+food+" ");
        }
    }
    public static void main(String[]args){
        //make and run a main method
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear Pooh=new Bear("Pooh");
        Pooh.eat("fish");
        Pooh.eat("meat");
        Unicorn Rarity=new Unicorn("Rarity");
        Rarity.eat("Marshmallows");
        Rarity.eat("JellyBeans");
        Giraffe Gemma=new Giraffe("Gemma");
        Gemma.eat("leaves");
        Gemma.eat("meat");
    }
}

