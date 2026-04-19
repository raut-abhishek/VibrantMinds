class DBConfig {
    private String host;
    private int port;
    private String dbName;
    private boolean ssl;

    private DBConfig() {}

    public static class Builder {
        private String host = "localhost";
        private int port = 5432;
        private String dbName;
        private boolean ssl = false;

        public Builder host(String host) {
            this.host = host;
            return this;
        }

        public Builder port(int port) {
            this.port = port;
            return this;
        }

        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        public Builder ssl(boolean ssl) {
            this.ssl = ssl;
            return this;
        }

        public DBConfig build() {
            DBConfig config = new DBConfig();
            config.host   = this.host;
            config.port   = this.port;
            config.dbName = this.dbName;
            config.ssl    = this.ssl;
            return config;
        }
    }

    @Override
    public String toString() {
        return host + ":" + port + "/" + dbName + " (ssl=" + ssl + ")";
    }
}


public class MethodChain2 {
    public static void main(String[] args) {
        DBConfig config = new DBConfig.Builder()
            .host("prod.db.server.com")
            .port(5432)
            .dbName("codesync_db")
            .ssl(true)
            .build();

        System.out.println(config);
    }
}