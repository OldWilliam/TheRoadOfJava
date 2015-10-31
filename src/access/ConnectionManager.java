/*
2015-10-15 下午8:21:17
 */
package access;

/*
 * 当构造函数访问控制权限为private时，无法实例该类。但是，可以通过该类的静态方法来返回一个实例，这貌似就是单例模式。
 */
public class ConnectionManager {
	private static int size = 10;
	private static Connection[] connArray;

	public ConnectionManager() {
		connArray = new Connection[size];
		for (int i = 0; i < connArray.length; i++) {
			connArray[i] = Connection.getConn();
		}
	}

	public static Connection getConnection() {
		size = size -1;
		if (size != -1) {
			return connArray[size]; 
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		ConnectionManager connMan = new ConnectionManager();
		Connection connection = ConnectionManager.getConnection();
		System.out.println(connection.toString());
		System.out.println(ConnectionManager.getConnection().toString());
		
	}
}

class Connection {
	private static int counter = 0;
	private int id;
	private Connection() {
		id = counter++;
	}
	
	@Override
	public String toString() {
		return "The connection's id is "+id;
	}

	public static Connection getConn() {
		return new Connection();
	}
}
