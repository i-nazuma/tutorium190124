import java.util.ArrayList;
import java.util.Scanner;

public class Cheatsheet {
    //Attribute (private!)
    private String name;
    private ArrayList<String> stringList;

    //Konstruktor
    public Cheatsheet(String name) {
        this.name = name;
        this.stringList = new ArrayList<>();
    }

    //Getter
    public String getName() {
        return name;
    }

    //isEmpty
    public boolean isEmpty() {
        return stringList.isEmpty();
    }

    //clear ArrayList
    public void clear() {
        stringList.clear();
    }

    //EXCEPTION THROWING + TO STRING
    public void print() throws Exception {
        if (stringList.isEmpty()) {
            throw new Exception("List is empty.");
        }
        for (String item : stringList) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        if (stringList.isEmpty()) {
            return "Cheatsheet " + name + " is empty.";
        }

        String result = "Cheatsheet " + name + " contains:\n";
        for (String item : stringList) {
            result += "- " + item + "\n";
        }
        return result;
    }

    public void setList() {

        // Clear the list before adding new items
        stringList.clear();

        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Lemon");
        stringList.add("Strawberry");
        stringList.add("Grape");
    }

    // DeleteLast method - removes the last element from stringList
    public void deleteLast() {
        if (!stringList.isEmpty()) {
            stringList.remove(stringList.size() - 1);
        }
    }

    // DeleteFirst method - removes the first element from stringList
    public void deleteFirst() {
        if (!stringList.isEmpty()) {
            stringList.remove(0);
        }
    }

    //@Override
    public void export() {
        String ADMIN_PW = "password";
        if (stringList.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();

        if (ADMIN_PW.equals(password)) {
            System.out.println("Correct password.");
            // do something
        } else {
            System.out.println("Wrong password. Access denied");
        }
    }
}