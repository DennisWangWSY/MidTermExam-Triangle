import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {

	private Triangle tri = null;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testgetBorders(){
		tri = new Triangle(1,1,1);
		tri.getBorders();
	}
	@Test
	public void testgetType1() {
		tri = new Triangle(3,4,5);
		assertEquals("Scalene",tri.getType(tri));
	}
	@Test
	public void testgetType2() {
		tri = new Triangle(3,3,3);
		assertEquals("Regular",tri.getType(tri));
	}
	@Test
	public void testgetType4() {
		tri = new Triangle(3,4,3);
		assertEquals("Isosceles",tri.getType(tri));
	}
	@Test
	public void testgetType5() {
		tri = new Triangle(4,3,3);
		assertEquals("Isosceles",tri.getType(tri));
	}
	@Test
	public void testgetType6() {
		tri = new Triangle(3,3,4);
		assertEquals("Isosceles",tri.getType(tri));
	}
	@Test
	public void testgetTyp8() {
		tri = new Triangle(0,3,3);
		assertEquals("Illegal",tri.getType(tri));
	}
	Long a = Long.MAX_VALUE;
	@Test
	public void testgetType8() {
		tri = new Triangle(a,3,3);
		assertEquals("Illegal",tri.getType(tri));
	}
	@Test
	public void testgetType7() {
		tri = new Triangle(3,0,4);
		assertEquals("Illegal",tri.getType(tri));
	}
	@Test
	public void testgetType9() {
		tri = new Triangle(3,a,4);
		assertEquals("Illegal",tri.getType(tri));
	}
	@Test
	public void testgetType10() {
		tri = new Triangle(3,4,0);
		assertEquals("Illegal",tri.getType(tri));
	}
	@Test
	public void testgetType11() {
		tri = new Triangle(3,4,a);
		assertEquals("Illegal",tri.getType(tri));
	}
	@Test
	public void testgetType12() {
		tri = new Triangle(3,1,1);
		assertEquals("Illegal",tri.getType(tri));
	}
	@Test
	public void testgetType13() {
		tri = new Triangle(1,1,3);
		assertEquals("Illegal",tri.getType(tri));
	}
	@Test
	public void testgetType14() {
		tri = new Triangle(8,3,1);
		assertEquals("Illegal",tri.getType(tri));
	}
}
