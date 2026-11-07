import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FashionOrder order = new FashionOrder(
                "Aidana", "Evening Dress", 20000, 10, 3
        );

        BeautyAppointment appointment = new BeautyAppointment(
                "Madina", "Facial Treatment", 15000, 12, 2
        );

        PhotoshootSession session = new PhotoshootSession(
                "Aruzhan", "Summer Collection", 30000, 17, 4
        );

        List<StudioService> services = Arrays.asList(
                order, appointment, session
        );

        CostCalculationVisitor costVisitor =
                new CostCalculationVisitor();

        ScheduleValidationVisitor scheduleVisitor =
                new ScheduleValidationVisitor();

        System.out.println("=== COST CALCULATION ===");

        for (StudioService service : services) {
            service.accept(costVisitor);
            System.out.println();
        }

        System.out.println("=== SCHEDULE VALIDATION ===");

        for (StudioService service : services) {
            service.accept(scheduleVisitor);
            System.out.println();
        }
    }
}