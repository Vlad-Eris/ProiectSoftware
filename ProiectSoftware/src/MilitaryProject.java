
public class MilitaryProject extends Project {
    private String deadline;
    private String password;

    public MilitaryProject(String title, String objective, long[] funds, Manager manager,
                           String deadline, String password) {
        super(title, objective, funds, manager);
        this.deadline = deadline;
        this.password = password;
    }

    @Override
    public double getRisk() {
        return getMembers().size() / (password.length() * getFunds()[0]);
    }
}
