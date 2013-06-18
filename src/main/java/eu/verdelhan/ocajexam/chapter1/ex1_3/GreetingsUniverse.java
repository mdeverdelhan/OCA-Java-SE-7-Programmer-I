package eu.verdelhan.ocajexam.chapter1.ex1_3;

import eu.verdelhan.ocajexam.chapter1.ex1_3.planets.Earth;
import eu.verdelhan.ocajexam.chapter1.ex1_3.planets.Mars;
import eu.verdelhan.ocajexam.chapter1.ex1_3.planets.Venus;

public class GreetingsUniverse {

	public static void main(String[] args) {
		System.out.println("Greetings, Universe!");
		Earth e = new Earth();
		Mars m = new Mars();
		Venus v = new Venus();
	}
}