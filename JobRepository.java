import java.util.List;

public interface JobRepository {
    void saveVettedJobs(List<JobListing> vettedJobs);
}