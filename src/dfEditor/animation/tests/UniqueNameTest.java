package dfEditor.animation.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import dfEditor.animation.AnimationController;

public class UniqueNameTest {
	@Test
	public void test() {
		assertUniqueName("A", "A");
		assertUniqueName("A 1", "A", "A");
		assertUniqueName("A 2", "A", "A 1", "A");
	}

	private void assertUniqueName(String expected, String filename, String... existing) {
		String uniqueName = AnimationController.getUniqueName(filename, Arrays.asList(existing));
		assertEquals(expected, uniqueName);
	}
}
