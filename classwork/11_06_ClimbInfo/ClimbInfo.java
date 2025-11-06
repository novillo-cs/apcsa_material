public class ClimbInfo
{
    /**
     * Creates a ClimbInfo object with name peakName and time climbTime.
     *
     * @param peakName the name of the mountain peak
     * @param climbTime the number of minutes taken to complete the climb
     */
     
    private String peakName;
    private int climbTime;
    
    public ClimbInfo(String peakName, int climbTime)
    {
        this.peakName = peakName;
        this.climbTime = climbTime;
    }

    /**
     * @return the name of the mountain peak
     */
    public String getName()
    {
        return peakName;
    }

    /**
     * @return the number of minutes taken to complete the climb
     */
    public int getTime()
    {
        return climbTime;
    }

}
