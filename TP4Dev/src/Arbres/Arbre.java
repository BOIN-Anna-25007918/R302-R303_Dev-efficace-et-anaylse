package Arbres;

public class Arbre {
    public static void main(String[] args) {
        ArbreNAire<String> html = new ArbreNAire<>("html");
        ArbreNAire<String> finHtml = new ArbreNAire<>("/html");

        ArbreNAire<String> head = new ArbreNAire<>("head");
        ArbreNAire<String> finHead = new ArbreNAire<>("/head");

        ArbreNAire<String> body = new ArbreNAire<>("body");
        ArbreNAire<String> finBody = new ArbreNAire<>("/body");
        
        ArbreNAire<String> title = new ArbreNAire<>("title");
        ArbreNAire<String> finTitle = new ArbreNAire<>("/title");

        
        ArbreNAire<String> h1 = new ArbreNAire<>("h1");
        ArbreNAire<String> finH1 = new ArbreNAire<>("/h1");
        
        ArbreNAire<String> p = new ArbreNAire<>("p");
        ArbreNAire<String> finP = new ArbreNAire<>("/p");
        
        h1.ajoutChild(new ArbreNAire<>("Titre niveau 1"));
        h1.ajoutChild(finH1);
        
        p.ajoutChild(new ArbreNAire<>("Ceci est un paragraphe"));
        p.ajoutChild(finP);
        
        head.ajoutChild(title);
        
        title.ajoutChild(new ArbreNAire<>("Page test"));
        title.ajoutChild(finTitle);

        body.ajoutChild(h1);
        body.ajoutChild(p);
        
        html.ajoutChild(head);
        html.ajoutChild(finHead);
        html.ajoutChild(body);
        html.ajoutChild(finBody);
        html.ajoutChild(finHtml);

        System.out.println("Parcours du DOM HTML : ");
        System.out.println(html);
    }
}
