public class ScheduleValidationVisitor implements StudioVisitor {

    private boolean isValidTime(int startHour, int duration) {
        return startHour >= 9 && startHour + duration <= 20;
    }

    @Override
    public void visitFashionOrder(FashionOrder order) {
        boolean valid = isValidTime(order.getStartHour(), order.getDuration());

        System.out.println("Fashion Order schedule: " +
                (valid ? "VALID" : "INVALID"));
    }

    @Override
    public void visitBeautyAppointment(BeautyAppointment appointment) {
        boolean valid = isValidTime(
                appointment.getStartHour(),
                appointment.getDuration()
        );

        System.out.println("Beauty Appointment schedule: " +
                (valid ? "VALID" : "INVALID"));
    }

    @Override
    public void visitPhotoshootSession(PhotoshootSession session) {
        boolean valid = isValidTime(
                session.getStartHour(),
                session.getDuration()
        );

        System.out.println("Photoshoot schedule: " +
                (valid ? "VALID" : "INVALID"));
    }
}