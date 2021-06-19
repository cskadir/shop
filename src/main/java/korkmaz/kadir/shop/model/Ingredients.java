package korkmaz.kadir.shop.model;

public enum Ingredients {
    ESPRESSO("espresso"),
    HOTWATER("sıcak su"),
    STEAMEDMILK("buğulanmış süt"),
    MILKFOAM("kopürtülmüş süt"),
    HOTCHOCOLATE("sıcak çikolata");

    String description;

    Ingredients(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
