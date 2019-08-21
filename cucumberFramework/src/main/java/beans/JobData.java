package beans;

public class JobData {
    private static String jobtitle;
    private static String joblocation;

    public static String getJobtitle()
    {
        return jobtitle;
    }

    public static String getJoblocation()
    {
        return joblocation;
    }

    public static void setjobtitle(String jobtitle) {
        JobData.jobtitle = jobtitle;
    }

    public static void setlocation(String joblocation) {
        JobData.joblocation = joblocation;
    }
}
