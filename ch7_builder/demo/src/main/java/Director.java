// import Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("normal greeting");
        builder.makeItems(new String[]{
            "hey",
            "foo",
            "hoo",
        });
        builder.makeString("myao");
        builder.makeItems(new String[]{
            "morning",
            "afternoon",
            "evening"
        });
        builder.close();

    }
}
