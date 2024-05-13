package classes;

public class Dashboard {
    private String title;
    private String description;
    private String keywords;
    private String header;
    private String footer;
    private String color;
    private String fontFamily;
    private String fontSize;

    public Dashboard() {
    }

    public Dashboard(String title, String description, String keywords, String header, String footer, String color, String fontFamily, String fontSize) {
        this.title = title;
        this.description = description;
        this.keywords = keywords;
        this.header = header;
        this.footer = footer;
        this.color = color;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }

    public Dashboard(String title, String keywords, String header, String footer, String color, String fontFamily, String fontSize) {
        this.title = title;
        this.keywords = keywords;
        this.header = header;
        this.footer = footer;
        this.color = color;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }
}
