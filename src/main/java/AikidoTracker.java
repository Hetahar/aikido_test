import java.util.Date;

public class AikidoTracker {

    private int amount = 0;
    private int duration = 0;
    private int days = 0;

    public AikidoTracker() {
        this.amount = amount;
        this.days = days;
    }

    public void addDays(int days) {
        this.days += days;
    }

    public void addAmount(int amount) {
        this.amount += amount;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getAmount() {
        return amount;
    }

    public int getDays() {
        return days;
    }

    public void clearAmount() {
        amount = 0;
    }

    public int seeDuration() {
        int durationInHours = duration / 60;
        int durationInMinutes = duration % 60;
        if (duration > 60) {
            System.out.println("Duration: " + durationInHours + " hours and " + durationInMinutes + " minutes.");
        } else {
            System.out.println("Duration: " + duration + " minutes.");
        }
        return duration;
    }

    public void addTrainingSession(int amount, int duration) {
        addAmount(amount);
        setDuration(duration);
        addDays(1);
        System.out.println("Training session added: " + amount + " session in " + duration + " minutes.");
    }

    public boolean isEligibleForGraduation() {
        if (amount >= 100 || days >= (365/2)) {
            return true;
        }
        return false;
    }
}
