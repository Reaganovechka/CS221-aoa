/**
 * A class to execute MethodsToAnalyze methods for analysis.
 * Provides basic calls that can be run with the debugger in order to analyze each step of the methods.
 * This class is not intended to test the methods for correctness, rather to be used as a tool to step through each method.
 * 
 * @author Reagan Ovechka
 */
public class AnalysisTester {

    /**
     * Main method to execute MethodsToAnalyze methods. 
     * Calls each method with sample data to allow for stepping through the code with a debugger, which gives
     * insight to how each methods runs. Allowing for analysis.
     * @param args
     */
    public static void main(String[] args) {
        int[] data = {5, 3, 8, 1, 2};
        int[] data2 = {1, 2, 3, 4, 5};
        int[] empty = {};

        //Analyze find method
        int emptyCase = MethodsToAnalyze.find(empty, 3);
    
        int index = MethodsToAnalyze.find(data, 3);

        //Analyze replaceAll method
        MethodsToAnalyze.replaceAll(empty, 3, 7);
        MethodsToAnalyze.replaceAll(data, 9, 7); //oldValue not in array
        MethodsToAnalyze.replaceAll(data, 3, 7);

        //Analyze sortIt method
        MethodsToAnalyze.sortIt(data);
        MethodsToAnalyze.sortIt(data2); //best case
        MethodsToAnalyze.sortIt(empty);

    }
    
}
