package simulado_q1;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class UserBase{

    private List<User> users = new LinkedList<>();

    public User createUser(String nome){
        User user = new User(nome);
        this.users.add(user);
        return user;
    }

    public VerifiedUser createVerifiedUser(String string, Date date) {
        VerifiedUser user = new VerifiedUser(string, date);
        this.users.add(user);
        return user;
    }

    public double porcentagemVerificados() {

        double users = 0.00;
        double verifiedUsers = 0.00;

        for(User u: this.users){
            if(u instanceof VerifiedUser){
                verifiedUsers++;
            } else{
                users++;
            }
        }

        return 100.00*(verifiedUsers/(verifiedUsers+users));
    }

    public double tamanhoMedioTweets() {

        double tamanhoTotal = 0.00;
        double numTweets = 0.00;

        for(User u: this.users){
            for(Tweet t: u.getTweets()){
                numTweets++;
                tamanhoTotal += t.getText().length();
            }
        }

        return tamanhoTotal/numTweets;
    }

}
