// import TextBuilder;
// import HRMLBuilder;


public class Main {
    public static void main(String[] args) {
        if(args.length != 1){
            usage();
            System.exit(0);
        }

        if(args[0].equals("text")){
            TextBuilder textbuilder = new TextBuilder();
            Director director = new Director(textbuilder);
            director.construct();
            String result = textbuilder.getTextResult();
            System.out.println(result);

        }else if (args[0].equals("html")){
            HTMLBuilder htmlbuilder = new HTMLBuilder();
            Director director = new Director(htmlbuilder);
            director.construct();
            String filename = htmlbuilder.getHTMLResult();
            System.out.println(filename);
        }else{
            usage();
            System.exit(0);
        }
    }

    public static void usage(){
        System.out.println("dddd");
        System.out.println("aaa");
    }
}