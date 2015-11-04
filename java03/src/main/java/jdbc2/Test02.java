package jdbc2;

import java.sql.Connection;

public class Test02 {
  static class ConnectionConsumer extends Thread {
    DBConnectionPool pool;
    public ConnectionConsumer(DBConnectionPool pool) {
      this.pool = pool;
    }

    @Override
    public void run() {
      try {
        for (int i = 0; i < 100; i++) {
          Connection con = pool.getConnection();
          sleep((int)Math.random() * 1000);
          pool.returnConnection(con);
          sleep((int)Math.random() * 1000);
        }
      } catch (Exception e) {}
    }

  }
  public static void main(String[] args) throws Exception {
    DBConnectionPool pool = new DBConnectionPool(
        "com.mysql.jdbc.Driver",
        "jdbc:mysql://localhost:3306/java76db",
        "java76",
        "1111");
    ConnectionConsumer c1 = new ConnectionConsumer(pool);
    ConnectionConsumer c2 = new ConnectionConsumer(pool);
    ConnectionConsumer c3 = new ConnectionConsumer(pool);

    c1.start();
    c2.start();
    c3.start();
  }

}
