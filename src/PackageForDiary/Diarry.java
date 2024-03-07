package PackageForDiary;

import java.util.ArrayList;
import java.util.List;

public class Diarry {
    private String userName;
    private String password;
    private boolean locked;
    private int numberOfEntries;
    private int iD;
    private List<Entry> entries = new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Diarry(String name, String password) {
        this.userName = name;
        this.password = password;
    }

    public boolean unlockDiarry(String password) {
        if (this.password.equals(password)) {
            locked = false;
        }

        return false;
    }

    public void lockDiarry() {
        locked = true;
    }

    public Entry createEntry(String title, String body) {
        Entry entry = new Entry(title, body);
        entry.setiD(iD++);
        entries.add(entry);
        return entry;
    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public void deleteEntry(int iD) {
        Entry foundEntry = findEntryById(iD);
        entries.remove(foundEntry);
        numberOfEntries--;
    }
    public Entry findEntryById(int iD) {
        for (Entry entry : entries) {
            if(entry.getiD() == iD) {
                return entry;
            }
        }

         throw new InvalidIdException("ID not found");
    }

    public void updateEntry(int iD, String title, String body) {
        Entry entry = findEntryById(iD);
        entry.setTitle(title);
        entry.setBody(body);
        entries.remove(entry);
        entries.add(entry);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}