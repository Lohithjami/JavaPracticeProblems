package JavaPracticeMilestoneA;

public class Librarian extends User{

    private  String employeeNumber;

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard ");
        System.out.println("Employee Number : " + employeeNumber);
    }
    public boolean canBorrowBooks()
    {
        return true;
    }
    public void addNewBook(Book book)
    {

    }
    public void removeBook(Book book)
    {

    }
}
