package Arbres;

import java.util.List;
import java.util.ArrayList;

public class ArbreNAire<T> {
	private T value;
	private List<ArbreNAire<T>> children;
	
	public ArbreNAire(T value) {
		this.value = value;
		this.children = new ArrayList<>();
	}
	
	public T getValue() {
		return value;
	}
	
	public List<ArbreNAire<T>> getChildren() {
		return children;
	}
	
	public void ajoutChild(ArbreNAire<T> child){
		this.children.add(child);
	}
	
	public String parcoursPrefixe() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.value).append(" ");
        for (ArbreNAire<T> child : this.children) {
        	sb.append(child.parcoursPrefixe());
        }
        return sb.toString();
    }
	
	public String toString() {
        return parcoursPrefixe();
    }
	
	public static void main (String[] args) {
		ArbreNAire<String> cinq = new ArbreNAire<>("5");
        ArbreNAire<String> six = new ArbreNAire<>("6");
        
        ArbreNAire<String> deux = new ArbreNAire<>("2");
        deux.ajoutChild(cinq);
        deux.ajoutChild(six);

        ArbreNAire<String> trois = new ArbreNAire<>("3");
        ArbreNAire<String> quatre = new ArbreNAire<>("4");

        ArbreNAire<String> un = new ArbreNAire<>("1");
        un.ajoutChild(deux);
        un.ajoutChild(trois);
        un.ajoutChild(quatre);

        System.out.println("Parcours préfixé N-aire : " + un.parcoursPrefixe());
	}
}
