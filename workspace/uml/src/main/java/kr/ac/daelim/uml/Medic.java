package kr.ac.daelim.uml;

public class Medic extends Unit {

	public String name;
	public int health;
	
	public void move() {
		System.out.println("유닛이 이동한다");
	}
	public void underAttack(Charactor charactor) {
		System.out.println("유닛이 공격받는다");
	}
	public void healing(Charactor charactor) {
		System.out.println("유닛이 회복한다");
	}
}
