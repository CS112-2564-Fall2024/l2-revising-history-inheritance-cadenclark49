public class HistoricalEvent {
    String description;
    Date eventDay;

    public HistoricalEvent(String description, Date eventDay) {
        this.description = description;
        this.eventDay = eventDay;
    }

    @Override
    public String toString() {
        return "Event: " + description + "\nDate: " + eventDay.toString();
    }

}
