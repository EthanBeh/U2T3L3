public class Student {
    // instance variables
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;
    private double highestTestScore;


    //constructors
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        accumulatedTestScores = 0;
        testScoreCount = 0;
        highestTestScore = 0;
    }


    /* Getter Methods */
    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public double getHighestTestScore() {
        return highestTestScore;
    }



    /* Setter Methods */
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }


    /* All Other Methods */
    public void addTestScore (double newTestScore) {
        accumulatedTestScores += newTestScore;
        testScoreCount++;
        if (newTestScore > highestTestScore) {
            highestTestScore = newTestScore;
        }
    }


    public boolean isPassing() {
        return (averageTestScore() >= 65);
    }


    public double averageTestScore() {
        return accumulatedTestScores / testScoreCount;
    }


    public void printStudentInfo() {
        System.out.println("Name: " + lastName + ", " + firstName );
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Number of tests: " + testScoreCount);
        System.out.println("Average Test Score: " + averageTestScore());
        System.out.println("Highest Test Score: " + highestTestScore);
        if (isPassing()) {
            System.out.println("This student is passing");
        } else {
            System.out.println("This students is not passing");
        }
    }
}
