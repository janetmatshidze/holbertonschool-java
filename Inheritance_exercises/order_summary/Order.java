import products.Products;

public class Order {

    private double discountPercentage;
    private ItemOrder[] items;

    public Order(double discountPercentage, ItemOrder[] items) {
          this.discountPercentage = discountPercentage;
          this.items = items;
    
    }

    public double calculateTotal(){
        double total = 0;

        for(ItemOrder item : items){
            total += item.getQuantity() 
            * item.getProduct().getNetPrice();
        }
        total = total - (total * discountPercentage / 100);

        return total;
    }

    public void presentOrderSummary() {
      double totalProducts = 0;

      System.out.println("------- ORDER SUMMARY -------");

      for(ItemOrder item : items) {

        Products product = item.getProduct();

        double price = product.getNetPrice();
        int quantity = item.getQuantity();
        double total = price * quantity;

        totalProducts += total; // totalProducts = totalProducts + total

        System.out.printf( 
            "Type: %s  Title: %s  Price: %.2f  Quant: %d  Total: %.2f%n",
            product.getClass().getSimpleName(),
            product.getTitle(),
            price,
            quantity,
            total
        );
    }

    double discount = totalProducts * discountPercentage / 100;
    double totalOrder = totalProducts - discount;

    System.out.println("----------------------------");
    System.out.printf("DISCOUNT: %.2f%n", discount);
    System.out.printf("TOTAL PRODUCTS: %.2f%n", totalProducts);
    System.out.println("----------------------------");
    System.out.printf("TOTAL ORDER: %.2f%n", totalOrder);
    System.out.println("----------------------------");
}

}