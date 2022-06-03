package com.customer;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.net.ServerSocket;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RewardPointsApplicationTests {

	@Test
	public void contextLoads() 
	{
		try (ServerSocket serverSocket = new ServerSocket(9091)){
			System.getProperties().put("server.port",String.valueOf(serverSocket.getLocalPort()));
		}catch(IOException exception){
			fail("Port is not available");
		}
		RewardPointsApplication.main(new String[] {});
	}

}
