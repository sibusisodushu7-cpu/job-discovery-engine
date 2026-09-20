import java.util.ArrayList;
import java.util.List;

public class InMemoryJobRepository implements JobRepository {
    private List<JobListing> database = new ArrayList<>();

    @Override
    public void saveVettedJobs(List<JobListing> vettedJobs) {
        this.database.addAll(vettedJobs);
        System.out.println("Repository: Successfully saved " + vettedJobs.size() + " vetted jobs to local memory database!");
    }
}