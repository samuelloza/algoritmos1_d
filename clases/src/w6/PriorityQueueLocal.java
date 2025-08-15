package w6;

import java.util.PriorityQueue;

class PersonaHopsitaL implements Comparable<PersonaHopsitaL> {

	private String name;
	private int priority;

	public PersonaHopsitaL(String nombre, int priority) {
		this.name = nombre;
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public int getPriority() {
		return priority;
	}
	
	@Override
	public int compareTo(PersonaHopsitaL person) {
		//return this.name.compareTo(person.name);
		
		if (this.priority == person.priority) {
			return 0;
		}
		
		if (this.priority < person.priority) {
			return 1;
		}
		
		return -1;
	}
}

public class PriorityQueueLocal {

	public static void main(String[] args) {
		PriorityQueue<PersonaHopsitaL> priorityQueue = new PriorityQueue<PersonaHopsitaL>();

		// Prioridad 0 es bajo
		// Prioridad 10 es alta
		priorityQueue.add(new PersonaHopsitaL("a", 0));
		priorityQueue.add(new PersonaHopsitaL("z", 1));
		priorityQueue.add(new PersonaHopsitaL("b", 9));
		priorityQueue.add(new PersonaHopsitaL("c", 5));
		priorityQueue.add(new PersonaHopsitaL("f", 10));
		priorityQueue.add(new PersonaHopsitaL("gf", 2));
		priorityQueue.add(new PersonaHopsitaL("f", 100));


		while (!priorityQueue.isEmpty()) {
			PersonaHopsitaL persona = priorityQueue.poll();
			System.out.println(persona.getName() + " " + persona.getPriority());
		}
	}
}
