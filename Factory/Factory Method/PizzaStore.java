public abstract class PizzaStore {

  public Pizza orderPizza(String type) {
    Pizza pizza;

    pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  // The Factory Method Pattern defines an interface for creating an object, but lets subclassees decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
  protected abstract Pizza createPizza(String type);

  // other methods here
}
