public class Runner {
    public static void main(String[]args){
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
        Bee Stinger=new Bee("Stinger");
        Stinger.eat("marshmallows");
        Stinger.eat("pollen");
        Animal[] animals={tigger,Pooh,Rarity,Stinger,Gemma};
        ZooKeeper zoebot=new ZooKeeper("Zoebot");
        zoebot.feedAnimals(animals,"Leaves");
        zoebot.feedAnimals(animals,"Meat");
        zoebot.feedAnimals(animals,"Pollen");
    }
}
