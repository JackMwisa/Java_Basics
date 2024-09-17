package Day4;

public class Product {
    private String productName;
    private double price;
    private int quantityInStock;

    /*My constructor*/
    public Product(String productName, double price, int quantityInStock){
        this.productName = productName;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    /* my getters */
    public String getProductName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }
    public int getQuantityInStock(){
        return quantityInStock;
    }



    public void updateStock(int quantity){
        if (quantityInStock + quantity < 0)
            System.out.println("Nothing in stock");
        else {
            this.quantityInStock += quantity;
        }
    }


    public String getDetails(){
        return  "Product: "+ productName + "\nPrice: " + price + "\n stock: " + quantityInStock;
    }




}


