

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private double heightInInches;
    private double weightInPounds;

    // Constructor
    public HealthProfile(String firstName, String lastName, String gender,
                         int birthDay, int birthMonth, int birthYear,
                         double heightInInches, double weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    // Setters
    public void setFirstName(String firstName) { 
        this.firstName = firstName; }
    public void setLastName(String lastName) { 
        this.lastName = lastName; }
    public void setGender(String gender) { 
        this.gender = gender; }
    public void setBirthDay(int birthDay) { 
        this.birthDay = birthDay; }
    public void setBirthMonth(int birthMonth) { 
        this.birthMonth = birthMonth; }
    public void setBirthYear(int birthYear) { 
        this.birthYear = birthYear; }
    public void setHeightInInches(double heightInInches) { 
        this.heightInInches = heightInInches; }
    public void setWeightInPounds(double weightInPounds) { 
        this.weightInPounds = weightInPounds; }

    // Getters
    public String getFirstName() { 
        return firstName; }
    public String getLastName() { 
        return lastName; }
    public String getGender() { 
        return gender; }
    public int getBirthDay() { 
        return birthDay; }
    public int getBirthMonth() { 
        return birthMonth; }
    public int getBirthYear() { 
        return birthYear; }
    public double getHeightInInches() { 
        return heightInInches; }
    public double getWeightInPounds() { 
        return weightInPounds; }

    // Age calculation (assume current year = 2025)
    public int getAge() {
        return 2025 - birthYear;
    }

    // Max heart rate
    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    // Target heart rate range
    public String getTargetHeartRateRange() {
        int maxHR = getMaxHeartRate();
        int lower = (int)(maxHR * 0.50);
        int upper = (int)(maxHR * 0.85);
        return lower + " - " + upper + " bpm";
    }

    // BMI calculation
    public double getBMI() {
        return (weightInPounds / (heightInInches * heightInInches)) * 703;
    }

    // BMI chart
    public String getBMIChart() {
        return "BMI VALUES\n" +
               "Underweight: less than 18.5\n" +
               "Normal:      between 18.5 and 24.9\n" +
               "Overweight:  between 25 and 29.9\n" +
               "Obese:       30 or greater";
    }
}  // class