public class RevisedHistoricalEvent extends HistoricalEvent {
    String revisedDescription;
    String citation;

    public RevisedHistoricalEvent(String description, Date eventDay, String revisedDescription, String citation) {
        super(description, eventDay);
        this.revisedDescription = revisedDescription;
        this.citation = citation;
    }

    public void teach() {
        System.out.println("Revised Event Details:");
        System.out.println("Original Description: " + description);
        System.out.println("Revised Description: " + revisedDescription);
        System.out.println("Date: " + eventDay.toString());
        System.out.println("Citation: " + citation);
    }

}
