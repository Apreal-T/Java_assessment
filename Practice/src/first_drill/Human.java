package first_drill;

public class Human {
	
	 String name;
	 int age;
	 String gender;
	 double height;
	
	 
	 public Human (	String name, int age, String gender, double height)
	 {
		 this.name = name;
		 this.age = age;
		 this.gender = gender;
		 this.height = height;
			
	 }
	

	public static void main(String[] args){
			
	arrayLoop();

	}
	
	public static void arrayLoop()
	{
		
		Human [] humans = new Human[4];
		Human first = new Human("Bisi", 55, "female", 15.55);
		Human second = new Human("Hadassah", 35, "female", 10.55);
		Human third = new Human("Emeka", 15, "male", 7.55);
		Human fourth = new Human("John", 10, "male", 5.00);
		
		humans[0] = first;
		humans[1] = second;
		humans[2]= third;
		humans[3] = fourth;
		
		
		for(int i= 0; i<humans.length; i++)
		{
			
			System.out.println(humans[i].name+ " is  " +  humans[i].age + "years old, "  +  "and  " + humans[i].height + "ft tall and is a " + humans[i].gender);
			
		}
		
		for(int i= 0; i<humans.length; i++)
		{
			if (humans[i].age <= 15)
			{
				System.out.println("child"); 
			}else if (humans[i].age <= 50) {
				System.out.println("adult");
				}
			else {
					System.out.println("oldie");
				}
			}
		}
	

	
}
