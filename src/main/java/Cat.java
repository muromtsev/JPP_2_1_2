public class Cat {
    private String name;
    private String message;

    public Cat(String name, String voice) {
        this.name = name;
        this.message = voice;
    }

    public String getVoice() {
        return this.name + ": " + this.message;
    }
}
