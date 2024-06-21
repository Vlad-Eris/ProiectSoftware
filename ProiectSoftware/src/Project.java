import java.util.ArrayList;

public abstract class Project implements Risky {
	
    private String title;
    private String objective;
    private long[] funds;
    private Manager manager;
    private ArrayList<Member> members;

    public Project(String title, String objective, long[] funds, Manager manager) {
        this.title = title;
        this.objective = objective;
        this.funds = funds;
        this.manager = manager;
        this.members = new ArrayList<>();
    }

    public void addMember(Member m) {
        members.add(m);
    }
}
