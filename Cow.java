class Cow implements Animal
{
    //your code here
    protected String myType;
    protected String mySound;
    public Cow(String type, String sound)
    {
    	myType = type;
    	mySound = sound;
    }
    public Cow()
    {
    	myType = "unknown";
    	mySound = "unknown";
    }
    public String getType()
    {
    	return myType;
    }
    public String getSound()
    {
    	return mySound;
    }
}