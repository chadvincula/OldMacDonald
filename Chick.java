class Chick implements Animal
{
    //your code here
    private String myType;
    private String mySound1;
    private String mySound2;
    public Chick(String type, String sound1, String sound2)
    {
    	myType = type;
    	mySound1 = sound1;
    	mySound2 = sound2;
    }
    public Chick()
    {
    	myType = "unknown";
    	mySound1 = "unknown";
    	mySound2 = "unknown";
    }
    public String getType()
    {
    	return myType;
    }
    public String getSound()
    {
    	if((int)(Math.random()*2) == 0)
			return mySound1;
		else
			return mySound2;
    }
}