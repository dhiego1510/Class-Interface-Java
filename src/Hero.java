public abstract class Hero implements Action {
  int health;
  int energy;
  Hero (int health, int energy) {
    this.health = health;
    this.energy = energy;
  }

  public abstract void superPower();
}
