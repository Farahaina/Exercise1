//Author : Nur Farahaina
public class Aquarium {
	public int length, height, width;

	public void fillFish(){
		Fish fish1 = new Fish();
		//fish1.color = "green";
		

		fish1.SetColor("green");

		System.out.println("Many " + fish1.GetColor() + " fish here");

		fish1.Swim();
	}


}