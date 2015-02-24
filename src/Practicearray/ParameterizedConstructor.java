package Practicearray;

public class ParameterizedConstructor 
{
	private String name;
	public ParameterizedConstructor(String str)
	{
		this.name = str;
		System.out.println("I am inside parameterized constructor.");
		System.out.println("The parameter value is : "+ str);
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ParameterizedConstructor mcp = new ParameterizedConstructor("My picnic day");

	}





   }
