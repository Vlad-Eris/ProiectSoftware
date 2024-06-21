
public class CommercialProject extends Project {
    private String deadline;
    private long marketingFunds;
    private int teams;

    public CommercialProject(String title, String objective, long[] funds, Manager manager,
                             String deadline, long marketingFunds, int teams) {
        super(title, objective, funds, manager);
        this.deadline = deadline;
        this.marketingFunds = marketingFunds;
        this.teams = teams;
    }

    @Override
    public double getRisk() {
        return (teams * 3.0) / (getMembers().size() * getFunds()[0] - marketingFunds);
    }
}
