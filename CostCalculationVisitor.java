public class CostCalculationVisitor implements StudioVisitor {

    @Override
    public void visitFashionOrder(FashionOrder order) {
        double total = order.getPrice() + 5000;

        System.out.println("Fashion Order: " + order.getItemName());
        System.out.println("Customer: " + order.getCustomerName());
        System.out.println("Total price: " + total + " KZT");
    }

    @Override
    public void visitBeautyAppointment(BeautyAppointment appointment) {
        double total = appointment.getPrice() + 2000;

        System.out.println("Beauty Appointment: " + appointment.getServiceName());
        System.out.println("Client: " + appointment.getClientName());
        System.out.println("Total price: " + total + " KZT");
    }

    @Override
    public void visitPhotoshootSession(PhotoshootSession session) {
        double total = session.getPrice() + 10000;

        System.out.println("Photoshoot: " + session.getConcept());
        System.out.println("Model: " + session.getModelName());
        System.out.println("Total price: " + total + " KZT");
    }
}