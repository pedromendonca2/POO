package simulado_q1;

import java.util.Date;

public class VerifiedUser extends User{

    private Date date;

    public VerifiedUser(String string, Date date) {
        super(string);
        this.date = date;
    }
    
}
