package tech.strategio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class shoppingCartTest {

  private ShoppingCart shoppingCart;

  @BeforeEach
  public void createCart() {
    shoppingCart = new ShoppingCart();
  }

  @Test
  public void emptyTest() {
    assertEquals(true, true);
  }

  @Test
  public void zeroItemsWhenCreated() {
    assertEquals(0, shoppingCart.getItemCount());
  }

  @Test
  public void testAddItems() {
    Product test_product = new Product("item1", 10.99);
    shoppingCart.addItem(test_product);
    assertEquals(1, shoppingCart.getItemCount());
  }

  @Test
  public void removeItemNotFound() throws ProductNotFoundException{
    Product unreal = new Product("Golden Ticket", 1.99);
    assertThrows(ProductNotFoundException.class, ()-> shoppingCart.removeItem(unreal));
  }

  @Test
  public void isCartEmpty() {
    shoppingCart.empty();
    assertEquals(0, shoppingCart.getItemCount(), 0.0001);
  }
}
