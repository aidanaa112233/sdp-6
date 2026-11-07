public class FashionOrder implements StudioService {
    private String customerName;
    private String itemName;
    private double price;
    private int startHour;
    private int duration;

    public FashionOrder(String customerName, String itemName,
                        double price, int startHour, int duration) {
        this.customerName = customerName;
        this.itemName = itemName;
        this.price = price;
        this.startHour = startHour;
        this.duration = duration;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getStartHour() {
        return startHour;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void accept(StudioVisitor visitor) {
        visitor.visitFashionOrder(this);
    }
}