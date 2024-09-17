package Day4;


import java.util.ArrayList;

class ShoppingCart {

    private ArrayList<CartItem> cartItems;


    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }


    public void viewCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (CartItem item : cartItems) {
                System.out.println(item.getCartItemDetails());
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getTotalPrice();
        }
        return total;
    }





    public static void main(String[] args) {
        // Step 1: Create several products
        Product product1 = new Product("Laptop", 1200.00, 10);
        Product product2 = new Product("Smartphone", 800.00, 20);
        Product product3 = new Product("Headphones", 150.00, 15);

        // Step 2: Create a ShoppingCart instance
        ShoppingCart shoppingCart = new ShoppingCart();

        // Step 3: Add products to the cart with varying quantities
        shoppingCart.addToCart(product1, 2);
        shoppingCart.addToCart(product2, 1);
        shoppingCart.addToCart(product3, 3);


        shoppingCart.viewCart();


        double totalCost = shoppingCart.calculateTotal();
        System.out.printf("Total cost of items in the cart: $%.2f\n", totalCost);

    }

}



