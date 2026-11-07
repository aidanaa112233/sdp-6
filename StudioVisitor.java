public interface StudioVisitor {
    void visitFashionOrder(FashionOrder order);

    void visitBeautyAppointment(BeautyAppointment appointment);

    void visitPhotoshootSession(PhotoshootSession session);
}