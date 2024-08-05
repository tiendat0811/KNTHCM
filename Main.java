import java.util.*;

public class Main{
    abstract static class Computer {
        public String name;

        abstract String getName();
        abstract void setName(String name);

        abstract float getPrice();
    }

    static class Desktop extends Computer{
        public String cpu;

        public Desktop(String name, String cpu){
            this.name = name;
            this.cpu = cpu;
        }

        @Override
        public String getName(){
            return this.name;
        }

        @Override
        public void setName(String name){
            this.name = name;
        }

        @Override
        public float getPrice(){
            return 1000f;
        }

        @Override
        public String toString(){
            return this.name + " - " + this.cpu + " " + this.getPrice();
        }
    }

    static class Laptop extends Computer{
        public String mainboard;

        public Laptop(String name, String mainboard){
            this.name = name;
            this.mainboard = mainboard;
        }

        @Override
        public String getName(){
            return this.name;
        }

        @Override
        public void setName(String name){
            this.name = name;
        }

        @Override
        public float getPrice(){
            return 3000f;
        }

        @Override
        public String toString(){
            return this.name + " - " + this.mainboard + " " + this.getPrice();
        }
    }

    interface Animal {
        void Talk();
    }

    interface BonChan{
        void run();
    }

    static class Dog implements Animal, BonChan{
        public Dog(){

        }

        @Override
        public void Talk(){
            System.out.println("GAU GAU");        }

        @Override 
        public void run(){
            System.out.println("CHAY CHAY");        }
    }

    static class Cat implements Animal, BonChan{
        public Cat(){

        }

        @Override
        public void Talk(){
            System.out.println("MEO MEO");
            
        }

        @Override 
        public void run(){
            System.out.println("NHAYQUA TUONG");
        }
    }


    public static void main(String args[]){
        Laptop lt1 = new Laptop("LAPTOP", "CPU!");
        Desktop dt1 = new Desktop("DESKTOP", "MAINBIAR");

        List<Computer> computers = new ArrayList<Computer>();
        computers.add(lt1);
        computers.add(dt1);

        for(Computer computer : computers){
            System.out.println(computer);
        }

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(dog1);
        animals.add(cat1);

        for(Animal animal : animals){
            animal.Talk();
            if (animal instanceof BonChan) {
                ((BonChan) animal).run();
            }
        } 
    }
}