public class PhotoshootSession implements StudioService {
    private String modelName;
    private String concept;
    private double price;
    private int startHour;
    private int duration;

    public PhotoshootSession(String modelName, String concept,
                             double price, int startHour, int duration) {
        this.modelName = modelName;
        this.concept = concept;
        this.price = price;
        this.startHour = startHour;
        this.duration = duration;
    }

    public String getModelName() {
        return modelName;
    }

    public String getConcept() {
        return concept;
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
        visitor.visitPhotoshootSession(this);
    }
}