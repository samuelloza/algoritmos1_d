package w6;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		/*CustomStack stack = new CustomStack();
		stack.push(1); //1er elemento
		stack.push(3); //2do elemento
		stack.push(5); //3er elemento

		System.out.println(stack.top()); //Obtiene el ultimo elemento
		System.out.println("----------");
		while (!stack.isEmpty()) {
			System.out.println(stack.top()); //Obtenemos 
			stack.pop(); //Saca el ultimo elemento
		}*/
		//Libreria de Java
		/*
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1); //1er elemento
		stack.push(3); //2do elemento
		stack.push(5); //3er elemento

		System.out.println(stack.peek()); //Obtiene el ultimo elemento
		System.out.println("----------");
		while (!stack.isEmpty()) {
			System.out.println(stack.peek()); //Obtenemos 
			stack.pop(); //Saca el ultimo elemento
		}*/
		
		//Usando la libreria de java
		/*
		 * Stack<Persona> stack = new Stack<Persona>();
		stack.push(new Persona("Juan", "Perez")); // Primera
		stack.push(new Persona("Armando", "Guerra")); //ultimo
		
		
		while (!stack.isEmpty()) {
			Persona persona = stack.peek();
			System.out.println(persona.MostrarPersona());
			
			stack.pop();
		}*/
		
		//Nuestra propia implementacion
		/*CustomStack stack = new CustomStack();
		stack.push(new Persona("Juan", "Perez")); // Primera
		stack.push(new Persona("Armando", "Guerra")); //ultimo
		
		
		while (!stack.isEmpty()) {
			Persona persona = stack.top();
			System.out.println(persona.MostrarPersona());
			
			stack.pop();
		}*/
		
		//Colas
		
		CustomQueue queue = new CustomQueue(20);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);

		System.out.println(queue.peek());
		System.out.println("**********");
		queue.remove(); //1
		System.out.println(queue.peek());
		System.out.println("**********");

		queue.remove(); //2
		queue.remove(); //3
		System.out.println(queue.peek());
		queue.remove();

		System.out.println(queue.peek());


		
	}
}
