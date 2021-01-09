/**
 * @Author: Tasneem Hoque
 * Basic record keeping class
 */
public class GradeAnalyzer {

    //setting up a list for Records and for storing summary data on grades
    private List<Record> gradeList;
    private int[] gradeSummary;

    /**
     * Constructor initializes the record list and the grade array
     */
    public GradeAnalyzer(){
       //your work starts here
        gradeList = new List<Record>();
        gradeSummary = new int [10];
    }

    /**
     * This method adds another student record to the Record list
     * @param r : Record, the student record to add
     */
    public void addRecord (Record r){
        gradeList.add(r);
    }

    /**
     * This method removes a student record from the Record list
     * @param r : Record, the student record to remove
     */
    public void removeRecord (Record r){
        gradeList.remove(r);
    }

    /**
     * This method removes all student records from the Record list
     */
    public void clearAllRecords(){
        gradeList.clear();
    }

    /**
     * This method prints all student records from the Record list in
     * the format [name, student]
     */
    public void printAllRecords(){
        System.out.println(gradeList.first().getStudentName() + "," + gradeList.first().getGrade());
        Record r = gradeList.next();
        for (int i = 1; i < gradeList.size(); i++) {
            if (r != null)
                System.out.println(r.getStudentName() + "," + r.getGrade());
             r = gradeList.next();
        }
    }

    /**
     * This method sorts all the grades with in the range of 9 and prints stars
     * to represent the number of grades with in that range
     */
    public void printHistogram(){
        Record r = gradeList.first();
        for(int i = 0; i < gradeList.size(); i++) {
            if ((r.getGrade()/10) == 10) // check if grade is in the 90 range
                gradeSummary[9]++;
            else if ((r.getGrade()/10)==0) // check if grade is below 10
                gradeSummary[0]++;
            else
                gradeSummary[(r.getGrade() / 10)]++; // for every other range
            r = gradeList.next();
        }

        String result ="";
        int lowerBound = 0, upperBound = 10;

        for(int i = 0; i < gradeSummary.length; i++){
           result = ""; // initialise result to nothing
            for(int j = 0; j < gradeSummary[i]; j++) // loop as many times as their are grades in the range
                result+="*"; // add that many number of stars

            System.out.println(lowerBound + "-" + upperBound + "|" + result); // print the result
            lowerBound += 10; upperBound += 10; // move to the next range
        }
    }
}
