package Arbres;

public class SinglyListArbreClass<T> {
	private T value;
	private SinglyListArbreClass<T> left;
	private SinglyListArbreClass<T> right;

	public SinglyListArbreClass() {		
		this.value = value;
        this.left = null;
        this.right = null;	
	}		
	
	public SinglyListArbreClass(T value, SinglyListArbreClass<T> left,SinglyListArbreClass<T> right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public T getValue() {		
		return value;	
	}
	
	public SinglyListArbreClass<T> getLeft() {		
		return left;	
	}
	
	public SinglyListArbreClass<T> getRight() {		
		return right;	
	}
	
	public void setLeft(SinglyListArbreClass<T> left) {		
		this.left = left;	
	}
	
	public void setRight(SinglyListArbreClass<T> right) {		
		this.right = right;	
	}
}
