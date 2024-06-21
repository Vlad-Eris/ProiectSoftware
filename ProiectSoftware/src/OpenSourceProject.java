
public class OpenSourceProject extends Project {
    private String mailingList;

    public OpenSourceProject(String title, String objective, long[] funds, Manager manager,
                             String mailingList) {
        super(title, objective, funds, manager);
        this.mailingList = mailingList;
    }

    @Override
    public double getRisk() {
        return getMembers().size() / getFunds()[0];
    }
}
