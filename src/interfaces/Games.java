package interfaces;

/*
 * 	接口与工厂(不解)
 */
interface Game {
	boolean move();
}

interface GameFactory {
	Game getGame();
}

class Checkers implements Game {
	private int moves = 0;
	private static final int MOVES = 3;

	@Override
	public boolean move() {
		System.out.println("Checkers move " + moves);
		return ++moves != MOVES;
	}
}

class CheckersFactory implements GameFactory{

	@Override
	public Game getGame() {
		return new Checkers();
	}
}
class Chess implements Game{
	private int moves = 0;
	private static final int MOVES = 4;
	@Override
	public boolean move() {
		System.out.println("Chess move "+ moves);
		return ++moves != MOVES;
	}
	
}

class ChessFactory implements GameFactory{

	@Override
	public Game getGame() {
		return new Chess();
	}
	
}
public class Games {
	public static void playGame(GameFactory factory){//玩游戏的时候，只需要传入相应的游戏工厂即可
		Game s = factory.getGame();					 //可复用，方法不需要改变，更加鲁棒
		while (s.move()) 							 //方便扩展
			;
	}
	public static void main(String[] args) {
		playGame(new CheckersFactory());
		playGame(new ChessFactory());
	}
}