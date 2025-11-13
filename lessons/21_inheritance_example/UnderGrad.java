public class UnderGrad extends Student {
    private boolean fullTime;

    public UnderGrad(String fName, String lName, String addr, int gr, boolean fTime) {
        super(fName, lName, addr, gr);
        fullTime = fTime;
    }

    public boolean getFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean newInput) {
        fullTime = newInput;
    }

    public String toString() {
        return ("Hello undergrad " + super.getFirstName());
    }
}
