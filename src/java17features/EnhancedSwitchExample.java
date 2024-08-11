package java17features;

public class EnhancedSwitchExample {

    public static void main(String[] args) {
        EnhancedSwitchExample enhancedSwitchExample = new EnhancedSwitchExample();
        enhancedSwitchExample.switchExpressionExample();
        enhancedSwitchExample.enhancedSwitchExample();
    }

    public void switchExpressionExample() {
        String day = "Monday";
        switch (day) {
            case "Monday" -> System.out.println("First day of the week");
            case "Tuesday" -> System.out.println("Second day of the week");
            case "Wednesday" -> System.out.println("Third day of the week");
            case "Thursday" -> System.out.println("Fourth day of the week");
            case "Friday" -> System.out.println("Fifth day of the week");
            case "Saturday" -> System.out.println("Sixth day of the week");
            case "Sunday" -> System.out.println("Seventh day of the week");
            default -> System.out.println("Invalid day of the week");
        }
    }

    public void enhancedSwitchExample() {
        String day = "Monday";
        switch (day) {
            case "Monday" -> {
                System.out.println("Enhanced: First day of the week");
            }
            case "Tuesday" -> {
                System.out.println("Enhanced: Second day of the week");
            }
            case "Wednesday" -> {
                System.out.println("Enhanced: Third day of the week");
            }
            case "Thursday" -> {
                System.out.println("Enhanced: Fourth day of the week");
            }
            case "Friday" -> {
                System.out.println("Enhanced: Fifth day of the week");
            }
            case "Saturday" -> {
                System.out.println("Enhanced: Sixth day of the week");
            }
            case "Sunday" -> {
                System.out.println("Enhanced: Seventh day of the week");
            }
            default -> {
                System.out.println("Enhanced: Invalid day of the week");
            }
        }
    }
}
