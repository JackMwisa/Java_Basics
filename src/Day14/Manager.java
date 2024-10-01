package Day14;

import java.util.Objects;


public class Manager extends Person {

    int managerID;
    int actionNumber;

    public Manager(String name, int age, String username, String password) {
        super(name, age, username, password);
        this.managerID = (int) (1000000 * Math.random());
        this.actionNumber = 0;
    }

    public int getManagerID() {
        return managerID;
    }

    public int getActionNumber() {
        return actionNumber;
    }

    public void setActionNumber(int actionNumber) {
        this.actionNumber = actionNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", ManagerID: " + managerID + ", ActionNumber: " + actionNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return super.equals(o) ||
                (managerID == manager.managerID && password.equals(manager.password));

        // (username.equals(manager.username) && password.equals(manager.password))

    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, managerID);
    }
}

