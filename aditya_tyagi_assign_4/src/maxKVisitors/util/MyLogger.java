package maxKVisitors.util;



public class MyLogger{

 // FIXME: Add more enum values as needed for the assignment
 public static enum DebugLevel { DELETION,INSERTION,
                                };

 private static DebugLevel debugLevel;


 // FIXME: Add switch cases for all the levels
 public static void setDebugValue (int levelIn) {
	switch (levelIn) {
	case 2: debugLevel = DebugLevel.DELETION; break;
	case 1: debugLevel = DebugLevel.INSERTION; break;
//	default: debugLevel = DebugLevel.NONE; break;
	}
 }

 public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
 }

 public static void writeMessage (String     message  ,
                                  DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
 }

 public String toString() {
	return "The debug level has been set to the following " + debugLevel;
 }
}
