/*
2015-10-15 ����10:30:37
 */
package reusing;

/*
 * 	�����̳�����ϵ���ӹ֮��
 */
public class Agent {
	Cleanser cleanser;
	public Agent() {
		cleanser = new Cleanser();
	}
	public void append(String a) {
		cleanser.append(a);
	}

	public void dilute() {
		cleanser.dilute();
	}

	public void apply() {
		cleanser.apply();
	}

	public void scrub() {
		cleanser.scrub();
	}
	
	public String toString() {
		return cleanser.toString();
	}
	public static void main(String[] args) {
		Agent agent = new Agent();
		agent.append("hello");
		System.out.println(agent.toString());
	}

}

class Cleanser {
	private String s = "Cleanser";

	public String append(String a) {
		s += a;
		return s;
	}

	public void dilute() {
		append("dilute");
	}

	public void apply() {
		append("apply()");
	}

	public void scrub() {
		append("scrub");
	}

	@Override
	public String toString() {
		return s;
	}
}
