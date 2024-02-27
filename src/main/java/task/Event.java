package task;

/**
 * Task Type-Event
 */
public class Event extends Task {
    protected String from;
    protected String to;

    public Event(String description, String from, String to) {
        super(description);
        identity = "[E]";
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String toString() {
        return super.toString() + "  (from: " + from + " to: " + to + ")";
    }
}
