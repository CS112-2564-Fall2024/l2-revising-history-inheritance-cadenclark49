public class HistoricalEvent {

//Constants
public static final String DEFAULT_Description = "Historical event description default.";

public static final Date DEFAULT_EVENT_DAY = new Date();

//Instance Variables
private String description;
private Date eventDay;

//Constructors
public HistoricalEvent(String description, Date eventDay) {
    if (!this.setAll(descriptionEventDay)) {
        System.out.println("ERROR: bad data given to full constructor");
        System.exit(0);
    }
}

public HistoricalEvent() {
    this(DEFAULT_DESCRIPTION, DEFAULT_EVENT_DAY);
}

public HistoricalEvent(HistoricalEvent original) {
    if (original != null){
    this.setAll(original.description, original.eventDay);
    }else{
        System.out.println("ERROR: null data given to copy constructor");
        System.exit(0);
    }
}

//Setters/Mutators
public void setDescription(String description) {
    this.description = description;
}

public boolean setEventDay(Date eventDay) {
    if (eventDay != null) {
        this.eventDay = new Date(eventDay);
        return true;
    } else {
        return false;
    }
}

public boolean setAll(String description, Date eventDay) {
    return this.setDescription(description) && this.setEventDay(eventDay);
}


//Getters/Accessors
public String getDescription() {
    return this.description;
}  


//Other Required Methods
@Override
public String toString() {
    return "On " + this.eventDay + ": " + this.description;
}

@Override
public boolean equals(Object other) {
    if (other = null) {
        return false;
    } else if (other instanceof HistoricalEvent){
        return false;
    } else {
        HistoricalEvent otherEvent = (HistoricalEvent) other;
        return this.description.equals(otherEvent.description) && this.eventDay.equals(otherEvent.eventDay);
    }
}
}

