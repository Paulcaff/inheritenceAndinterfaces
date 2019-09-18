public class Zoo {

    public static void main(String[] args) {
        Animal animal1 = new Animal(2,"F",120);
        Animal animal2 = new Animal(2,"M",145);

        System.out.println("Animal Class");
        animal1.eat();
        animal2.sleep();
        animal1.eat();

        System.out.println("Bird Class");
        Bird bird = new Bird(4,"M",14);
       // bird.fly();
        bird.eat();
        bird.sleep();

        System.out.println("Fish Class");
        Fish fish = new Fish(2,"F",23);
        fish.swim();
        fish.eat();
        fish.sleep();

        System.out.println("Chicken Class");
        Chicken chicken = new Chicken(1,"F",2);
        chicken.eat();
        chicken.sleep();
        chicken.fly();

        System.out.println("Sparrow Class");
        Sparrow sparrow = new Sparrow(1,"F", 2);
        sparrow.eat();
        sparrow.sleep();
        sparrow.fly();




    }
}
