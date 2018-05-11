public class Ability{
  int damage;
  int heal;
  public Ability(int d, int h){
    damage = d;
    heal = h;
  }
  public void setDamage(int d){
    damage = d;
  }
  public int useAbilityd(){
    return damage;
  }
  public int useAbilityh(){
    return heal;
  }
}
