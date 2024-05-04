public class Chameleon extends Pet implements FoodBath{

    private String ChameleonType;// Tipo de camaleon

    public Chameleon(){}

    public Chameleon(String name, String species, String breed, String chameleonType) {
        super(name, species, breed);
        ChameleonType = chameleonType;
    }

    public String getChameleonType() {
        return ChameleonType;
    }

    public void setChameleonType(String chameleonType) {
        ChameleonType = chameleonType;
    }

    @Override
    public String getFoodMode() {
        return "Insectos";
    }

    @Override
    public String getBathMethod() {
        return "Baño seco";
    }
}
