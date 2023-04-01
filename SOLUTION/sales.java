package stores;
public class sales extends stores.stock {
    private int qty_sold;

    public sales(int item_no, String item_name, int stock_available, double cost, int qty_sold) {
        super(item_no, item_name, stock_available, cost);
        this.qty_sold = qty_sold;
    }

    public int getQty_sold() {
        return qty_sold;
    }

    public void setQty_sold(int qty_sold) {
        this.qty_sold = qty_sold;
    }

    public double calculateSales() {
        return qty_sold * getCost();
    }
    public String toString() {
        return super.toString() + ", Quantity Sold: " + qty_sold + ", Sales: " + calculateSales();
    }
}