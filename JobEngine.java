import java.util.Comparator;
import java.util.List;

public class JobEngine {
    private final JobProvider provider;
    private final JobRepository repository;

    public JobEngine(JobProvider provider, JobRepository repository) {
        this.provider = provider;
        this.repository = repository;
    }

    public List<JobListing> vetJobsForExperience(int yearsOfExperience) {
        List<JobListing> vettedJobs = provider.getAvailableJobs().stream()
                .filter(job -> job.getRequiredYearsOfExperience() <= yearsOfExperience + 1)
                .sorted(Comparator.comparingInt(JobListing::getRequiredYearsOfExperience))
                .toList();

        repository.saveVettedJobs(vettedJobs);
        return vettedJobs;
    }
}
