/**
 * @Author: Tasneem Hoque
 * A basic class that uses the GradeAnalyzer class.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradeAnalyzerTester {

    public static void main(String[] args) throws FileNotFoundException {

        GradeAnalyzer analyzer = new GradeAnalyzer();
        //Your work starts here
        Scanner sc = new Scanner(System.in); // initialise scanner

        System.out.print("Enter the filename to read from: ");
        String filename = sc.nextLine(); // get file name from user

        File file = new File(filename); // initialise file
        Scanner inputFile = new Scanner(file); // can the file

        Record r; // initialise object of type record

        while (inputFile.hasNext()){
            String name = inputFile.nextLine(); // read the student name

            if(name.equals("-1")) // when the end of input is reached, break the loop
                break;

            int grade = inputFile.nextInt(); // read the integer grade
            inputFile.nextLine(); // move to next line of the file

            r = new Record(name, grade); // create the record object
            analyzer.addRecord(r); // add the new record to the GradeAnalyzer object
        }

        analyzer.printAllRecords(); // print all the record
        System.out.println("___________________________");
        analyzer.printHistogram(); // print the histogram of the record
    }
}
