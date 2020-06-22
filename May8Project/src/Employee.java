import java.time.LocalDate;

public class Employee {
    private int EmployeeId;
    private String Name;
    private LocalDate DoB;

    public void setDoB(LocalDate doB) {
        DoB = doB;
    }
    public LocalDate getDoB() {
        return DoB;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

   }
