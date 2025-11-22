/*
You do not have to write any code for this activity
Simply answer the questions in prompts to label parts of the class
 */

public class Plant {

    /* What name best describes these four members? Instance Variables */
    private String name;
    private String species;
    private double height;
    private boolean isFlowering;

    /* What name best describes this member? Class variables */
    private static int numPlants = 0;

    /* What name best describes this member? Constructor */
    public Plant() {
        name = "";
        species = "";
        height = 0.0;
        isFlowering = false;
        numPlants++;
    }

    /* What name best describes this member? Constructor */
    public Plant(String name, String species, double height, boolean isFlowering) {
        this.name = name;
        this.species = species;
        this.height = height;
        this.isFlowering = isFlowering;
        numPlants++;
    }

    /* What name best describes this member? Accessor */
    public String getName() {
        return name;
    }

    /* What name best describes this member? Accessor */
    public String getSpecies() {
        return species;
    }

    /* What name best describes this member? Accessor */
    public double getHeight() {
        return height;
    }

    /* What name best describes this member? Accessor */
    public boolean isFlowering() {
        return isFlowering;
    }

    /* What name best describes this member? Mutator*/
    public void setName(String name) {
        this.name = name;
    }

    /* What name best describes this member? Mutator*/
    public void setSpecies(String species) {
        this.species = species;
    }

    /* What name best describes this member? Mutator*/
    public void setHeight(double height) {
        this.height = height;
    }

    /* What name best describes this member? Mutator*/
    public void setFlowering(boolean flowering) {
        isFlowering = flowering;
    }
}
