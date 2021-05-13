
package Modelo;

public class Q_Actions {
    private int Q_counter;
    private String Q_User;
    private int Q_idQuestion;
    private boolean Q_useful;
    private boolean Q_useless;
    private boolean Q_favorite;

    public int getQ_counter() {
        return Q_counter;
    }

    public void setQ_counter(int Q_counter) {
        this.Q_counter = Q_counter;
    }

    public String getQ_User() {
        return Q_User;
    }

    public void setQ_User(String Q_User) {
        this.Q_User = Q_User;
    }

    public int getQ_idQuestion() {
        return Q_idQuestion;
    }

    public void setQ_idQuestion(int Q_idQuestion) {
        this.Q_idQuestion = Q_idQuestion;
    }

    public boolean isQ_useful() {
        return Q_useful;
    }

    public void setQ_useful(boolean Q_useful) {
        this.Q_useful = Q_useful;
    }

    public boolean isQ_useless() {
        return Q_useless;
    }

    public void setQ_useless(boolean Q_useless) {
        this.Q_useless = Q_useless;
    }

    public boolean isQ_favorite() {
        return Q_favorite;
    }

    public void setQ_favorite(boolean Q_favorite) {
        this.Q_favorite = Q_favorite;
    }    
}
