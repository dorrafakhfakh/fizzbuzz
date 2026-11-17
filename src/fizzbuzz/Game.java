package fizzbuzz;

public class Game {
	
	private int round=1;
	
	public String next() {
	    StringBuilder sb = new StringBuilder();
	    sb.append(round++);
	    return sb.toString();
	}

}
