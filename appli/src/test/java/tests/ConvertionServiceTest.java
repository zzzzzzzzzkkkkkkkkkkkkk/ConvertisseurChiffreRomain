package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import utils.ConvertionService;

class ConvertionServiceTest {

	@Test
	void test1() {
		ConvertionService conv = new ConvertionService();
		String result = conv.convertChiffreToRomain(9);
		assertEquals(result, "IX");
	}
	
	@Test
	void test2() {
		ConvertionService conv = new ConvertionService();
		String result = conv.convertChiffreToRomain(400);
		assertEquals(result, "CD");
	}
	
	@Test
	void test3() {
		ConvertionService conv = new ConvertionService();
		String result = conv.convertChiffreToRomain(320);
		assertEquals(result, "CCCXX");
	}
	
	@Test
	void test4() {
		ConvertionService conv = new ConvertionService();
		String result = conv.convertChiffreToRomain(1260);
		assertEquals(result, "MCCLX");
	}
	
	@Test
	void test5() {
		ConvertionService conv = new ConvertionService();
		String result = conv.convertChiffreToRomain(479);
		assertEquals(result, "CDLXXIX");
	}
	
	@Test
	void test6() {
		ConvertionService conv = new ConvertionService();
		String result = conv.convertChiffreToRomain(444);
		assertEquals(result, "CDXLIV");
	}
	

	@Test
	void test7() {
		ConvertionService conv = new ConvertionService();
		String result = conv.convertChiffreToRomain(949);
		assertEquals(result, "CMXLIX");
	}
	
	@Test
	void test8() {
		ConvertionService conv = new ConvertionService();
		String result = conv.convertChiffreToRomain(2540);
		assertEquals(result, "MMDXL");
	}
	
	@Test
	void test9() {
		ConvertionService conv = new ConvertionService();
		String result = conv.convertChiffreToRomain(1492);
		assertEquals(result, "MCDXCII");
	}
	
	@Test
	void test10() {
		ConvertionService conv = new ConvertionService();
		String result = conv.convertChiffreToRomain(832);
		assertEquals(result, "DCCCXXXII");
	}
	
}
