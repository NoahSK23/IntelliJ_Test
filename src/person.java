public class person {
    private String name;
    private boolean thighs;
    private boolean smug;

    public person(String name, boolean thighs, boolean smug) {
        this.name = name;
        this.thighs = thighs;
        this.smug = smug;
        System.out.println("The person " + this.name + " has been created");
    }

    public boolean getThighs() {
        return this.thighs;
    }
    public boolean getSmug() {
        return this.smug;
    }
    public String getName() {
        return this.name;
    }
}
