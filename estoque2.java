public class estoque2 {

    private String name;
    private double price;
    private int quantity;

    public estoque2(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public int getQuantity(){
        return quantity;
    }

    public double totalValueInShock(){
        return price*quantity;
    } 

    public void addProduct(int quantity){
        this.quantity += quantity;
    }

    public void removProduct(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $"
            + String.format("%.2f",totalValueInShock());

    }
}
