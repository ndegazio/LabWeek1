public class Drink {
    private String name;
    private double price;
    private int size;

    public Drink(String name, double price, int size) {
        setName(name);
        setPrice(price);
        setSize(size);
    }

    public String toString(){
        return String.format("Name of Drink: " + name + "\nPrice of drink: $" + price + "\nSize of drink: " + size + "ml");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
