public class JobListing {
    private String title;
    private String company;
    private String location;
    private int salary;
    private int requiredYearsOfExperience = 2; // Default mock experience requirement

    public JobListing(String title, String company, String location, int salary) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public int getRequiredYearsOfExperience() {
        return this.requiredYearsOfExperience;
    }
}