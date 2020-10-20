//Author : Nur Farahaina
public class Driver{

	public static void main (String [] arg) {
		//Fish actually is a data type
		//Fish nemo; == int x;
		Fish nemo = new Fish(); //nemo is object, Fish is class
		nemo.Swim();
		//nemo.color = "red"; //tukar value
		nemo.SetColor("red");
		nemo.Swim();


		//nemo.Eat();  //superclass call subclass method


		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();

		//Fish dory = new Fish(); //another object
		//dory.Swim();
	    //dory.color = "yellow";
		//dory.SetColor("yellow");
		//dory.Swim();

		//Aquarium fancyAquarium = new Aquarium();
		//fancyAquarium.fillFish();

		
	}


}