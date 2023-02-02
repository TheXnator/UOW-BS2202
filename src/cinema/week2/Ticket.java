package cinema.week2;

public class Ticket {
    int screenNumber;
    String name;

    public Ticket(int screenNumber, String name) {
        this.screenNumber = screenNumber;
        this.name = name;
    }

    public String getName() {
        return (name != null) ? name : "Unknown Name";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public void setScreenNumber(int screenNumber) {
        this.screenNumber = screenNumber;
    }
}