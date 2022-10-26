package Products;

import java.util.*;


public class RecipeBook {
    private Set<Recipe> recipeSet;

    public RecipeBook() {
        recipeSet = new HashSet<>();
    }

    public void addRecipe(Recipe recipe) throws RuntimeException {
        try {
            if (!recipeSet.contains(recipe)) {
                recipeSet.add(recipe);
            } else {
                throw new RuntimeException(recipe.getNameOfRecipe() + " уже есть в книге");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "В этой кулинароной книги рецепты: " +
                "recipeSet=" + recipeSet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeBook that = (RecipeBook) o;
        return Objects.equals(recipeSet, that.recipeSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeSet);
    }
}
