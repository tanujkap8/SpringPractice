package main;

/**
 * Created by tanuj on 7/6/17.
 */
public class Database
{
    int port;
    String name;

    public int getPort() { return port; }

    public void setPort(int port) { this.port = port; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString()
    {
        return "Database{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }

}
