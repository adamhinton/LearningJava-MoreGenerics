package dev.lpa.model;

public class LPAStudent extends Student{

    private double percentComplete;

    public LPAStudent() {
        // Interseting that we can just use `random` from Student
        percentComplete = random.nextDouble(0, 100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch (fName){
            case "NAME" -> this.getName().equalsIgnoreCase(value);
            case "COURSE" -> this.getCourse().equalsIgnoreCase(value);
            case "YEARSTARTED" -> this.getYearStarted() >= (Integer.parseInt(value));
            default -> false;
        };
    }

}
