/*
2015-10-31 下午8:38:08
 */
package interfaces;

/*
 * 	
 */
interface Monster {
	void menace();
}

interface DangerousMonster extends Monster { // 接口继承接口，用关键字extends，而不是implents
	void destory();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {

	@Override
	public void menace() {
	}

	@Override
	public void destory() {
	}

}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {

	@Override
	public void destory() {
	}

	@Override
	public void menace() {
	}

	@Override
	public void kill() {
	}

	@Override
	public void drinkBlood() {
	}
}

public class HorrorShow {
	static void u(Monster b){b.menace();}
	static void v(DangerousMonster d){
		d.menace();
		d.destory();
	}
	
	static void w(Lethal l){l.kill();}
	public static void main(String[] args) {
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
}
