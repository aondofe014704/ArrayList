package DiaryPackage;

import DiaryPackage.InvalidUserNameException.InvalidUserNameException;

import java.util.ArrayList;
import java.util.List;

public class Dr {
    private List<D> diaryList = new ArrayList<>();

    public void add(String userName, String password) {
        D diary = new D(userName, password);
        diaryList.add(diary);
    }

    public int getNumOfDiaries() {
        return diaryList.size();
    }

    public D findByUsername(String username) {
        for(D diary: diaryList)
            if(username.equals(diary.getUserName()))
                return diary;
        throw new InvalidUserNameException("User name not found");
    }

    public void deleteDiary(String userName, String password) {
        D diary = findByUsername(userName);
        if(diary.getPassword().equals(password))
            diaryList.remove(diary);

    }
}
