public class BeautyAppointment implements StudioService {
    private String clientName;
    private String serviceName;
    private double price;
    private int startHour;
    private int duration;

    public BeautyAppointment(String clientName, String serviceName,
                             double price, int startHour, int duration) {
        this.clientName = clientName;
        this.serviceName = serviceName;
        this.price = price;
        this.startHour = startHour;
        this.duration = duration;
    }

    public String getClientName() {
        return clientName;
    }

    public String getServiceName() {
        return serviceName;
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
        visitor.visitBeautyAppointment(this);
    }
}
