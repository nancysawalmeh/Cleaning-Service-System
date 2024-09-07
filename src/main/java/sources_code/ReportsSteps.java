package sources_code;


public class ReportsSteps {
	
private static boolean isreport;


private ReportsSteps() {
    throw new IllegalStateException("Utility class");
  }


public static boolean isIsreport() {
	return isreport;
}

public static void setIsreport(boolean isreport) {
	ReportsSteps.isreport = isreport;
}

	

}
