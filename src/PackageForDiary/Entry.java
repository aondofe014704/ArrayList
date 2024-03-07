package PackageForDiary;

import java.time.LocalDateTime;

public class Entry {
    private int iD = 0;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public void setiD(int iD) {
        this.iD = iD;
    }

    public int getiD() {
        return iD;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Entry(String title, String body){
    this.title = title;
    this.body = body;
}

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("{\n\ttitle: %s\n\tbody: %s\n}", title, body);
    }
}
