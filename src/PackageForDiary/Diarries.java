package PackageForDiary;

import java.util.ArrayList;
import java.util.List;

public class Diarries {
    List<Diarry> diarries = new ArrayList<>();

    public void add(String userName, String password) {
        Diarry diarry = new Diarry(userName, password);
        diarries.add(diarry);
    }

    public int getNumberOfDiarries() {
        return diarries.size();
    }

    public List<Diarry> findByUserName(String userName) {
        List<Diarry> dairy1 = new ArrayList<>();
        for (Diarry diarry : diarries) {
            if (diarry.getUserName().equals(userName)){
                dairy1.add(diarry);

            }
        }
        return dairy1;
    }

    public void delete(String userName, String password) {
        for (Diarry diarry2 : diarries){
            if(diarry2.getUserName().equals(userName) && diarry2.getPassword().equals(password)){
                diarries.remove(diarry2);
            }
            break;
        }
    }
}

