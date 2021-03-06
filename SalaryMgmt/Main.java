import java.util.Vector;

class Main {
	public static void main(String[] args) {
		Vector<Person> vector = new Vector<Person>(5,5);
		
		Input input = new Input(vector);
		input.input();
	
		Calc calc = new Calc(vector);
		calc.calc();
		
		Sort sort = new Sort(vector);
		sort.sort();
		
		Output out = new Output(vector);
		out.output();
	}
}
