public class Wolverine extends Hero {
  String nameHero;
  String weakness;
  String team;
  int age;

  public Wolverine(int health, int energy) {
    super(health,energy);
  }

  public void specialAttack(){
    System.out.println("Momento de furia que permite tener energia y salud ilimitada por un tiempo");
    System.out.println("Energy: "+(energy -= 50));

  }
  public void attack(){
    health-=40;
    System.out.println("Recibes ataque!!, Health: " + health);
  }
  public void regenerate(){
    System.out.println("Recupero salud y energia");
    System.out.println("Energy: "+ (energy = 100));
    System.out.println("Health: " + (health = 100));

  }

  public void superPower() {
    useHands();
    jump();
    specialAttack();
  }

  @Override
  public void useHands() {
    System.out.println("Ataca con garras de adamantium");
    System.out.println("Energia bajó a " + (energy -= 20));
  }

  @Override
  public void useFeet() {

  }

  @Override
  public void move() {

  }

  @Override
  public void jump() {
    System.out.println("Saltos sobrehumanos");
    System.out.println("Energia bajó a " + (energy -= 10));
  }

  @Override
  public void talk() {

  }
}
