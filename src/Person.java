public class Person
{
    private String firstName;
    private String lastName;
    private int yob;

    public Person(String firstName, String lastName, int yob)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yob = yob;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getYob()
    {
        return yob;
    }

    public void setYob(int yob)
    {
        this.yob = yob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yob=" + yob +
                '}';
    }
}
