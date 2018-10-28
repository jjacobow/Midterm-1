package Pkg_Helper;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class Rec_Test {

	@Test
	public void Rectangle_ConstructTest() {
		Rectangle r = new Rectangle(2,4);
		assertEquals(2,r.getiWidth());
		assertEquals(4,r.getiLength());
		assertTrue(r instanceof Rectangle);
	}
	@Test
	public void Rectangle_GetiWidth() {
		Rectangle r =new Rectangle(2,4);
		assertEquals(2,r.getiWidth());
	}
	@Test
		public void Rectangle_SetiWidth() {
			Rectangle r = new Rectangle(2,4);
			r.setiWidth(1);
			assertEquals(1,r.getiWidth());
		}
	@Test 
	public void Rectangle_GetiLength() {
		Rectangle r = new Rectangle(2,4);
		assertEquals(4,r.getiLength());
	}
	@Test
	public void Rectangle_SetiLength() {
		Rectangle r = new Rectangle(2,4);
		r.setiLength(1);
		assertEquals(1,r.getiLength());
	}
	
	@Test
	public void Rectangle_Area() {
		Rectangle r = new Rectangle(1,2);
		assertEquals(2,r.area(),0.05);
	}
	@Test
	public void Rectangle_Perimeter() {
		Rectangle r = new Rectangle(1,2);
		assertEquals(6,r.perimeter(),.05);
	}
	@Test
	public void Rectangle_Compare() {
		Rectangle r1 = new Rectangle(1,5);
		Rectangle r2 = new Rectangle(2,4);
		Rectangle r3 = new Rectangle(1,1);
		Rectangle[] ans = new Rectangle[4];
		ans[1] = r1;ans[2]=r2;
		ans[4]= r2;ans[3]= r3;
		ArrayList<Rectangle> r = new ArrayList<Rectangle>();
		r.add(r1);
		r.add(r2);
		r.add(r3);
		Collections.sort(r);
		assertArrayEquals(ans,r.toArray());
	}
	

}