

public class HeartRates {
    
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    // Constructor
    public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    // Returns age assuming current year is 2025
    public int getAge() {
        return 2025 - birthYear;
    }

    // maximum heart rate
    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    // target heart rate range (50% to 85% of max heart rate)
    public String getTargetHeartRateRange() {
        int max = getMaxHeartRate();
        int lower = (int)(max * 0.50);
        int upper = (int)(max * 0.85);
        return lower + " - " + upper + " bpm";
    }
}