package classes.type;

public class Category {
    private String categoryNomber;
    private String valueCategory;
    private String color;

    public Category() {
    }

    public Category(String categoryNomber, String valueCategory) {
        this.categoryNomber = categoryNomber;
        this.valueCategory = valueCategory;
    }

    public Category(String categoryNomber, String valueCategory, String color) {
        this.categoryNomber = categoryNomber;
        this.valueCategory = valueCategory;
        this.color = color;
    }

    public String getCategoryNomber() {
        return categoryNomber;
    }

    public void setCategoryNomber(String categoryNomber) {
        this.categoryNomber = categoryNomber;
    }

    public String getValueCategory() {
        return valueCategory;
    }

    public void setValueCategory(String valueCategory) {
        this.valueCategory = valueCategory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}