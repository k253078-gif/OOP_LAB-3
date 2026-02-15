package OOP_LAB_3;

public class Programmer {
    int id;
    String name;
    String preferredLanguage;
    int problemsSolved;

    // Default constructor
    Programmer(){

    }
    // Parameterized Constructor
    Programmer(int i, String n, String lang, int solved) {
        this.id = i;
        this.name = n;
        this.preferredLanguage = lang;
        this.problemsSolved = solved;
    }

    //Update solved problems (Setter)
    void updateProblems(int moreSolved) {
        this.problemsSolved += moreSolved;
        System.out.println(name + " solved " + moreSolved + " more problems!");
    }

    //Display details(Getter)
    void displayInfo() {
        System.out.println("Programmer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Preferred Language: " + preferredLanguage);
        System.out.println("Problems Solved: " + problemsSolved);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Programmer p1 = new Programmer(1, "Wasi", "Java", 50);
        Programmer p2 = new Programmer(2, "Wasi2", "Python", 80);

        p1.displayInfo();
        p2.displayInfo();

        // Update problems
        p1.updateProblems(30);
        p2.updateProblems(25);

        // Display again
        p1.displayInfo();
        p2.displayInfo();
    }
}
