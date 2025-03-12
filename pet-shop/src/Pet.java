public class Pet {

    private final String name;
    private boolean clean;

    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }

    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }

    public void clean() {
        clean = true;
    }

    public void unclean() {
        clean = false;
    }

}
