package Pkg_Helper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Collections;
import java.util.ArrayList;

public class Cub_Test {

		@Test
		public void CuboidConstructTest(){
			Cuboid cube = new Cuboid (2,3,4);
			assertEquals(4,cube.getiDepth());
			assertEquals(3,cube.getiLength());
			assertEquals(2,cube.getiWidth());
			assertTrue(cube instanceof Cuboid);
		}
		@Test
		public void GetiDepthTest() {
			Cuboid cube = new Cuboid(2,3,4);
			assertEquals(4,cube.getiDepth());
		}
		@Test
		public void SetiDepthTest() {
			Cuboid c = new Cuboid(2,3,4);
			c.setiDepth(5);
			assertEquals(4,c.getiDepth());
		}
		@Test
		public void CubeAreaTest() {
			Cuboid c = new Cuboid(1,2,3);
			assertEquals(22,c.area(),0.05);
		}
		@Test
		public void testUnsupportedOperationException() {
			Cuboid c = new Cuboid(10,20,30);
			boolean thrown = false;

			  try {
			    c.perimeter();
			  } catch (UnsupportedOperationException e) {
			    thrown = true;
			  }

			  assertTrue(thrown);
			}
		@Test
		public void CubeVolumeTest() {
			Cuboid c = new Cuboid(1,2,3);
			assertEquals(6,c.volume(),0.05);
		}
		@Test
		public void Sort_AreaTest() {
			Cuboid c1 = new Cuboid(1,2,3);
			Cuboid c2 = new Cuboid(3,2,1);
			Cuboid c3 = new Cuboid(5,5,5);
			Cuboid[] ans = new Cuboid[3];
			ans[0] = c1;ans[1]=c2;ans[2]=c3;
			ArrayList<Cuboid> cubes = new ArrayList<Cuboid>();
			cubes.add(c2);cubes.add(c1);cubes.add(c3);
			Collections.sort(cubes, new Cuboid.SortByArea());
			assertArrayEquals(ans,cubes.toArray());
			}
		
		@Test
		public void Sort_VolumeTest() {
			Cuboid c1 = new Cuboid(1,2,3);
			Cuboid c2 = new Cuboid(3,2,1);
			Cuboid c3 = new Cuboid(5,5,5);
			Cuboid[] ans = new Cuboid[3];
			ans[0] = c1;ans[1]=c2;ans[2]=c3;
			ArrayList<Cuboid> cubes = new ArrayList<Cuboid>();
			cubes.add(c2);cubes.add(c1);cubes.add(c3);
			Collections.sort(cubes, new Cuboid.SortByVolume());
			assertArrayEquals(ans,cubes.toArray());
			}
		

	}