import java.util.Scanner;

public class estoque {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name=ent.nextLine();
        System.out.print("Price: ");
        double price=ent.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity=ent.nextInt();
        estoque2 product = new estoque2(name,price,quantity);
        System.out.println();

        product.setName("Computer");
        System.out.println("Updated for name: "+product.getName());

        product.setPrice(500);
        System.out.println("Updated for price: "+product.getPrice());

        product.setQuantity(20);
        System.out.println("Updated for quantity: "+product.getQuantity());

        System.out.println();
        System.out.println("Product data: "+ product);

        System.out.println();
        System.out.print("Enter the number of product to be added in stock: ");
        quantity=ent.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("UpDated data: "+ product);

        System.out.println();
        System.out.print("Enter the number of product to be remov in stock: ");
        quantity=ent.nextInt();
        product.removProduct(quantity);

        System.out.println();
        System.out.println("UpDated data: "+ product);


        ent.close();
    }
}
