public class RevisedHistoricalEvent extends HistoricalEvent {
    //Constants
    public static final String DEFAULT_REVISED_DESCRIPTION;
    public static final String DEFAULT_CITATION;

    //INSTANCE VARIABLES
    private String revisedDescription;
    private String citation;

    //Constructors
    public RevisedHistoricalEvent(String description, Date eventDay, String revisedDescription, String citation) {
        super(description, eventDay);
        this.serRevisedDescription(revisedDescription);
        this.setCitation(citation);
    }

    public RevisedHistoricalEvent(){
        this(HistoricalEvent.DEFAULT.DESCRIPTION, HistoricalEvent.DEFAULT_EVENT_DAY, DEFAULT_REVISED_DESCRIPTION, DEFAULT_CITATION);
    }

    public RevisedHistoricalEvent(RevisedHistoricalEvent original) {
        if (original != null) {
            this.setAll(original.getDescription(), original.getEventDay(), original.revisedDecription,
                    original.citation);
        } else {
            System.out.println("ERROR: null data given to copy constructor");
            System.exit(0);
        }
    }

    //Setters/mutators
    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = revisedDescription;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    public boolean setAll(String description, Date eventDay, String revisedDescription, String citation){
        if (!super.setAll(description, eventDay) {
                this.setRevisedDescription(revisedDescription);
                this.setRevisedDescription(revisedDescription);
                this.setCitation(citation);
                return true;
            } else {
                return false;
            }
        }

    public String getRevisedDescription() {
        return this.revisedDescription;
    }
    
    public String getCitation() {
        return this.citation;
    }

      //Other Methods
    @Override
    public String toString() {
        return "The following \"history\" was told for many years:\n\n" + super.toString()
                + "\n\n\nBy correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong.\nHere is the revised history:\n"
                + this.revisedDescription + "\n\nSource: " + this.citation;
    }
    
    @Overridepublic
    boolean equals(Object other) {
        if (other = null) {
            return false;
        } else if (this.getClass() != other.getClass()) {
            return false;
        } else {
            RevisedHistoricalEvent otherEvent = (RevisedHistoricalEvent) other;
            this.citation.equals(otherEvent.citation);
        }
    }
    } 
    

