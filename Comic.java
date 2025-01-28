public class Comic {
    private String writer;
    private String illustrator;
    private String colorist;
    private String title;
    private int issueNum;


    public Comic(String writer, String illustrator, String colorist, String title, int issueNum) {
        this.setWriter(writer);
        this.setIllustrator(illustrator);
        this.setColorist(colorist);
        this.setIssueNum(issueNum);
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    // Getter and Setter for issueNum
    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for colorist
    public String getColorist() {
        return colorist;
    }

    public void setColorist(String colorist) {
        this.colorist = colorist;
    }
    @Override
    public String toString() {
        return "Comic {" +
                "Title: '" + title + '\'' +
                ", Issue Number: " + issueNum +
                ", Illustrator: '" + illustrator + '\'' +
                ", Colorist: '" + colorist + '\'' +
                '}';
    }


}
