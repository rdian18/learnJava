class Enemy{
	String name;
	int hp;
	int poinAttack;
  void attack(){
  	System.out.println("Serang");
  }
}

class Zombie extends Enemy{
	void walk(){
		System.out.println("Jalan");
	}
}
class Pocong extends Enemy{
	void loncat(){
		System.out.println("Loncat-loncat")
	}
}

public class Main extends Enemy	{
	public static void main(String[] args) {
		Enemy monster = new Enemy();
		Zombie jombie = new Zombie();
		Pocong pocongg= new Pocong();

		monster.atack();
		jombie.walk();
		pocongg.loncat();

		jombie.loncat();
		pocongg.walk();

		
	}
}