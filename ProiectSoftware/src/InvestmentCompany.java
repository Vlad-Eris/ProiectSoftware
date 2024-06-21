import java.util.ArrayList;

public class InvestmentCompany {
    private ArrayList<Project> projects;

    public InvestmentCompany() {
        this.projects = new ArrayList<>();
    }

    public void addProject(Project p) {
        projects.add(p);
    }

    public Project getBestInvestment() {
        Project bestProject = null;
        double lowestRisk = Double.MAX_VALUE;

        for (Project project : projects) {
            double risk = project.getRisk();
            if (risk < lowestRisk) {
                lowestRisk = risk;
                bestProject = project;
            }
        }

        return bestProject;
    }

    public static void main(String[] args) {
        // Example usage
    }
}
