import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by Administrator on 2018/10/11.
 */

public class JedisTest {
    @Test
    public void test() {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.set("name", "lee");
        //jedis.auth("123123");  //登入密码

        String name = jedis.get("name");
        System.out.println(name);
        jedis.close();

    }

    @Test
    public void poolTest() {
        //获取连接池配置对象，设置配置项
        JedisPoolConfig config = new JedisPoolConfig();
        //最大连接数
        config.setMaxTotal(30);
        //最大空闲连接数
        config.setMaxIdle(10);

        //获取连接池
        JedisPool jedisPool = new JedisPool();
        //获取核心对象
        Jedis jedis = null;

        jedis = jedisPool.getResource();
        jedis.set("name", "home");
        String name = jedis.get("name");
        System.out.println(name);


    }


}

