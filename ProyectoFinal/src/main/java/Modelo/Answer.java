
package Modelo;

public class Answer {
    private int idAnswer;
    private int idUser;
    private int idQuestion;
    private String Answer_description;
    private boolean Answer_edited;
    private boolean Answer_delete;
    private String Answer_image;

    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getAnswer_description() {
        return Answer_description;
    }

    public void setAnswer_description(String Answer_description) {
        this.Answer_description = Answer_description;
    }

    public boolean isAnswer_edited() {
        return Answer_edited;
    }

    public void setAnswer_edited(boolean Answer_edited) {
        this.Answer_edited = Answer_edited;
    }

    public boolean isAnswer_delete() {
        return Answer_delete;
    }

    public void setAnswer_delete(boolean Answer_delete) {
        this.Answer_delete = Answer_delete;
    }

    public String getAnswer_image() {
        return Answer_image;
    }

    public void setAnswer_image(String Answer_image) {
        this.Answer_image = Answer_image;
    }    
}
