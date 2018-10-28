package Pkg_Helper;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class Rec_Test {

	@Test
	public void RecConstructTest() {
		Rectangle r = new Rectangle(2,4);
		assertEquals(2,r.getiWidth());
		assertEquals(4,r.getiLength());
		assertTrue(r instanceof Rectangle);
	}
	@Test
	public void RecGetiWidth() {
		Rectangle r =new Rectangle(2,4);
		assertEquals(2,r.getiWidth());
	}
	@Test
		public void RecSetiWidth() {
			Rectangle r = new Rectangle(2,4);
			r.setiWidth(1);
			assertEquals(1,r.getiWidth());
		}
	@Test 
	public void RecGetiLength() {
		Rectangle r = new Rectangle(2,4);
		assertEquals(4,r.getiLength());
	}
	@Test
	public void RecSetiLength() {
		Rectangle r = new Rectangle(2,4);
		r.setiLength(1);
		assertEquals(1,r.getiLength());
	}
	
	@Test
	public void RecArea() {
		Rectangle r = new Rectangle(1,2);
		assertEquals(2,r.area(),0.05);
	}
	@Test
	public void RecPer() {
		Rectangle r = new Rectangle(1,2);
		assertEquals(6,r.perimeter(),.05);
	}
	@Test
	public void RecCompare() {
		Rectangle r1 = new Rectangle(1,5);
		Rectangle r2 = new Rectangle(1,4);
		Rectangle r3 = new Rectangle(1,1);
		Rectangle r4 = new Rectangle(3,6);
		Rectangle[] answer = new Rectangle[4];
		//answer[1] = t6;answer[0]= t3;answer[2]= t4;answer[3]= t1;
		//answer[4]= t2;answer[5]= t5;
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
		recs.add(r1);
		recs.add(r2);
		recs.add(r3);
		recs.add(r4);
		Collections.sort(recs);
		assertArrayEquals(answer,recs.toArray());
	}
	

}