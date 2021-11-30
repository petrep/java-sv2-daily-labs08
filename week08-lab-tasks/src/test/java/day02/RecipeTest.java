package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

	@Test
	void createTestByName() {
		Recipe recipe = new Recipe("leves");

		assertEquals("leves", recipe.getName());
		assertNull(recipe.getDescription());
		assertEquals(0, recipe.getIngredients().size());
	}

	@Test
	void createTestByNameAndDescription() {
		Recipe recipe = new Recipe("leves", "finom");

		assertEquals("leves", recipe.getName());
		assertEquals("finom", recipe.getDescription());
		assertEquals(0, recipe.getIngredients().size());
	}

	@Test
	void addOneIngredient() {
		Recipe recipe = new Recipe("leves", "finom");

		recipe.addIngredient("hagyma");
		assertEquals("hagyma", recipe.getIngredients().get(0));
	}

	@Test
	void addMoreIngredients() {
		Recipe recipe = new Recipe("leves", "finom");

		recipe.addIngredient("hagyma", "hús", "répa");

		assertEquals(3, recipe.getIngredients().size());
		assertArrayEquals(new String[]{"hagyma", "hús", "répa"}, recipe.getIngredients().toArray());
	}
}