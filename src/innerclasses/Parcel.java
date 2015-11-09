/*
2015-11-2 ÏÂÎç4:40:59
 */
package innerclasses;

interface Destination {
	String readLable();
}

interface Contents {
	int value();
}

public class Parcel {
	private class PContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			return i;
		}

	}

	protected class PDestination implements Destination {
		private String lable;

		public PDestination(String whereTo) {
			lable = whereTo;
		}

		@Override
		public String readLable() {
			return lable;
		}

	}

	public Destination destination(String s) {
		return new PDestination(s);
	}

	public Contents contents() {
		return new PContents();
	}
}

class TestParcel {
	public static void main(String[] args) {
		Parcel p = new Parcel();
		Contents c = p.contents();
		Destination d = p.destination("Tartis");
		Parcel.PDestination pd = p.new PDestination("Doctor");
	}
}