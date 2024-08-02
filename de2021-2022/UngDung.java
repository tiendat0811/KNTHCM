import java.util.*;
public class UngDung{
    abstract static class Computer {
        public String code;
        public String cpu;
        public float inPrice;

        abstract public float getInPrice();
        abstract public float getPrice();
        abstract public String toString();
    }

    static class Laptop extends Computer {
        private String brand;

        public Laptop(String code, String cpu, float inPrice, String brand){
            this.code = code;
            this.cpu = cpu;
            this.brand = brand;
            this.inPrice = inPrice;
        }

        @Override
        public float getInPrice(){
            return this.inPrice;
        }

        @Override
        public float getPrice() {
            return inPrice * 135 / 100;
        }

        @Override 
        public String toString(){
            return "LAPTOP: " + this.code + "\nCPU: " + this.cpu + "\nBrand: " + this.brand + "\nPurchased price: " + this.inPrice + "\nSell Price: " + this.getPrice();
        }
    }

    static class Desktop extends Computer {
        private String mainboard;
        private float weight;
        
        public Desktop(String code, String cpu, float inPrice, String mainboard, float weight){
            this.code = code;
            this.cpu = cpu;
            this.mainboard = mainboard;
            this.inPrice = inPrice;
            this.weight = weight;
        }

        @Override
        public float getInPrice(){
            return this.inPrice;
        }

        @Override
        public float getPrice() {
            return (this.inPrice * 120 / 100) + (this.weight * 3);
        }

        @Override 
        public String toString(){
            return "DESKTOP: " + this.code + "\nCPU: " + this.cpu + "\nMainboard: " + this.mainboard + "\nPurchased price: " + this.inPrice + "\nSell Price: " + this.getPrice();
        }
    }

    public static float calculateRevenue(List<Computer> devices){
        float total = 0;
        for(Computer device: devices){
            float profit = device.getPrice() - device.getInPrice();
            total += profit;
        }
        return total;
    }

    public static void main(String args[]){
        Laptop laptop1 = new Laptop("LT1", "i5-12400H", 100, "Lenovo");
        Laptop laptop2 = new Laptop("LT2", "i9-12600H", 150, "Asus TUF");
        Desktop desktop1 = new Desktop("DT1", "i3-12100F", 100, "H610", 2.5f);
        Desktop desktop2 = new Desktop("DT2", "i7-13500", 200, "B760", 3f);
        Desktop desktop3 = new Desktop("DT3", "i9-14900K", 300, "Z790", 4f);

        List<Computer> devices = new ArrayList<Computer>();
        devices.add(laptop1);
        devices.add(laptop2);
        devices.add(desktop1);
        devices.add(desktop2);
        devices.add(desktop3);
        System.out.println("LIST DEVICES SIZE: " + devices.size());

        float revenue = calculateRevenue(devices);
        System.out.println("REVENUE: " + revenue);
    }
}

