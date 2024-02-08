import factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(args.length);
        if(args.length != 2){
            System.exit(0);
        }
        String filename = args[0];
        String classname = args[1];
        System.out.println(filename + " " + classname);

        Factory factory = Factory.getFactory(classname);

        // Blog
        Link blog1 = factory.createLink("Blog1", "https:/blog1");
        Link blog2 = factory.createLink("Blog2", "https:/blog2");
        Link blog3 = factory.createLink("Blog3", "https:/blog3");

        Tray blogTray = factory.createTray("blog site");
        blogTray.add(blog1);
        blogTray.add(blog2);
        blogTray.add(blog3);

        // News
        Link news1 = factory.createLink("New1", "https:/new111");
        Link news2 = factory.createLink("New2", "https:/new2");
        Tray news3 = factory.createTray("New3");
        news3.add(factory.createLink("New3 (US)", "https/new3"));
        news3.add(factory.createLink("New3 (Japan)", "https/new3"));

        Tray newsTray = factory.createTray("New Site");
        newsTray.add(news1);
        newsTray.add(news2);
        newsTray.add(news3);

        // Page
        Page page = factory.createPage("Blog and News", "Hiroshi");
        page.add(blogTray);
        page.add(newsTray);

        page.output(filename);
    }
}