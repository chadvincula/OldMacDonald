class Farm
{
	//your code here
	private Animal[] animals = new Animal[5];
	public Farm()
	{
		animals[0] = new NamedCow("cow", "moo", "Elsie");
		animals[1] = new Chick("chick", "cluck", "cheep");
		animals[2] = new Pig("pig", "oink");
		animals[3] = new Chick("chick", "cheep", "cluck");
		animals[4] = new Chick();
	}
	public void animalSounds()
	{
		for(int i = 0; i < animals.length; i++)
		{
			System.out.println(animals[i].getType()+" goes "+animals[i].getSound());
			System.out.println("The cow is known as "+((NamedCow)animals[0]).getName());
		}
	}
}
