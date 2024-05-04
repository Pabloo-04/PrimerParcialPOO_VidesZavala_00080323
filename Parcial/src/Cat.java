public class Cat extends Pet implements FoodBath{
    private String HairType; //Tipo de pelo
    private boolean Sterilized; // Esta castrado o no


    public Cat() {
    }

    public Cat(String name, String species, String breed, String hairType, boolean sterilized) {
        super(name, species, breed);
        HairType = hairType;
        Sterilized = sterilized;
    }

    public String getHairType() {
        return HairType;
    }

    public void setHairType(String hairType) {
        HairType = hairType;
    }

    public boolean isSterilized() {
        return Sterilized;
    }

    public void setSterilized(boolean sterilized) {
        Sterilized = sterilized;
    }

    @Override
    public String getFoodMode() {
        return "Whiskas";
    }

    @Override
    public String getBathMethod() {
        return "Baño semi-seco";
    }
}
