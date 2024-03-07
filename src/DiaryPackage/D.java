package DiaryPackage;


import BankApplication.InvalidPinException;

import java.util.ArrayList;
import java.util.List;

public class D {
    private String userName;
    private String password;
    private boolean isLocked;
    private int noOfDiaries;
    private List<E> listOfDiaries = new ArrayList<>();

//    public Dairy(String firstName, String lastName) {
//
//    }

//    public Diary(String userName, String password) {
//        this.userName = userName;
//        this.password = password;
//    }
    public D(String userName, String password) {
    this.userName = userName;
    this.password = password;
}





    public boolean isLocked() {
        return true;
    }

    public boolean locked() {
        return true;
    }

    public boolean unLocked(String password) {
        if(this.password.equals(password)) {
            return true;
        }
        throw new InvalidPinException("Invalid Password");

    }

    public void createEntry(String title, String body) {
        int generated = generated();
        E entry1 = new E(generated, "title", "body");
        listOfDiaries.add(entry1);

    }

    private int generated() {
        return ++noOfDiaries;
    }

    public int checkSizeOfTheList() {
        return listOfDiaries.size();
    }

    public void deleteEntry(int id) {
        E keepEntry = findEntryById(id);
        listOfDiaries.remove(keepEntry);
    }

    public E findEntryById(int id) {
        E foundEntry = null;
        for (E entry : listOfDiaries) {
            if (entry.getId() == id) {
                foundEntry = entry;
            }
        }
        return foundEntry;
    }

    public void updateEntry(int id, String title, String body) {
        for (E entry : listOfDiaries) {
            if (entry.getId() == id) {
                entry.setTitle(title);
                entry.setBody(body);
            }
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }


}

