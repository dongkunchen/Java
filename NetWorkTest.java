package com.atguigu.java1;

//接口應用:代理模式

public class NetWorkTest {
	public static void main(String[] args) {
		Server server = new Server();
		ProxyServer proxyServer = new ProxyServer(server);
		proxyServer.browse();
		
	}
	
}


interface NetWork{
	public void browse();
}


class Server implements NetWork{
	
	public void browse() {
		System.out.println("真實的服務器訪問網路");
	}
}

class ProxyServer implements NetWork{
	
	private NetWork work;
	
	public ProxyServer(NetWork work) {
		this.work = work;
	}
	

	
	public void check() {
		System.out.println("連網之前的檢查工作");
		
	}
	
	@Override
	public void browse() {
		check();
		work.browse();
	}
	
}