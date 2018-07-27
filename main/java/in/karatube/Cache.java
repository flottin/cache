
package in.karatube;

import redis.clients.jedis.*;


class Cache{
	private Jedis jedis;

	public Cache()
	{
		this.jedis = new Jedis("localhost");
		System.out.println("Cache redis initialized!");
	}

	public void set(String key, String value){
		String exists = this.get(key);
		if (null == exists){
			this.jedis.set(key, value);
		}else{
			System.out.println("key : " + key + " exists in cache");
		}
	}

	public String get(String key){
		return	this.jedis.get(key);
	}
}
