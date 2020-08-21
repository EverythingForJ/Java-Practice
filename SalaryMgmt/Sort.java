import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

class Sort {
	private Vector<Person> vector;

	Sort(Vector<Person> vector){
		this.vector = vector;
	}
	
	void sort() {
		Collections.sort(this.vector, new Comparator<Person>() {
			@Override
			public int compare(Person me, Person you) {
				return (me.getNumber()<you.getNumber()) ? -1 :
								(me.getNumber()>you.getNumber()) ? 1 : 0;
			}
		});
	}
}