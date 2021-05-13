
package Modelo;

public class Question {
    private int idQuestion;
    private int idUser;
    private int idCorrectAnswer;
    private int idCategory;
    private String Question_title;
    private String Question_description;
    private String Question_date;
    private boolean Question_edited;
    private boolean Question_delete;
    private String Question_image;

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdCorrectAnswer() {
        return idCorrectAnswer;
    }

    public void setIdCorrectAnswer(int idCorrectAnswer) {
        this.idCorrectAnswer = idCorrectAnswer;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getQuestion_title() {
        return Question_title;
    }

    public void setQuestion_title(String Question_title) {
        this.Question_title = Question_title;
    }

    public String getQuestion_description() {
        return Question_description;
    }

    public void setQuestion_description(String Question_description) {
        this.Question_description = Question_description;
    }

    public String getQuestion_date() {
        return Question_date;
    }

    public void setQuestion_date(String Question_date) {
        this.Question_date = Question_date;
    }

    public boolean isQuestion_edited() {
        return Question_edited;
    }

    public void setQuestion_edited(boolean Question_edited) {
        this.Question_edited = Question_edited;
    }

    public boolean isQuestion_delete() {
        return Question_delete;
    }

    public void setQuestion_delete(boolean Question_delete) {
        this.Question_delete = Question_delete;
    }

    public String getQuestion_image() {
        return Question_image;
    }

    public void setQuestion_image(String Question_image) {
        this.Question_image = Question_image;
    }
    
    
}
