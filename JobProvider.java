import java.util.List;

public interface JobProvider {
    List<JobListing> getAvailableJobs();
}