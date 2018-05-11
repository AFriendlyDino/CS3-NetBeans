public class Monster{
  int health;
  String name;
  int attack;

  public Monster(int h, int a){
    name = "";
    health = h;
    attack = a;
  }
  public void setAttack(int a){
    attack = a;
  }
  public void takeHealth(int taken){
    health = health - taken;
  }
  public void heal(int h, int healed){
    health = health + healed
  }
  public void heal(int h){
    health = h;
  }
  public int getHealth(){
    return health;
  }
  public int getAttack(){
    return attack;
  }
  public String getName(){
    return name;
  }
}
