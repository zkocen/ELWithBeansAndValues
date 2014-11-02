package com.worldmanager.models.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.worldmanager.models.WebUser;

public class WebUserTest {

	WebUser wu;
	String uid = "authorized_user";
	String pwd = "presta123";
	int authLevel = 19;
	
	@Before
	public void setUp() throws Exception {
		wu = new WebUser();
		wu.setUid(uid);
		wu.setPwd(pwd);
		wu.setAuthLevel(authLevel);
	}

	@Test
	public void testConstructor() {
		assertNotNull("Default constructor not working for WebUser");
	}
	
	@Test
	public void testMutatorsAndAccessors() {
		assertEquals("value not set correcty for uid", uid, wu.getUid());
		assertEquals("value not set correcty for pwd", pwd, wu.getPwd());
		assertEquals("value not set correcty for auth level", authLevel, wu.getAuthLevel());
	}
}
