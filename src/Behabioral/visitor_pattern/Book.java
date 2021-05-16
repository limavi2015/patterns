package Behabioral.visitor_pattern;

class Book implements ItemElement
{
    private int price;
    private String name;

    public Book(int cost, String name)
    {
        this.price=cost;
        this.name =name;
    }

    public int getPrice()
    {
        return price;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor)
    {
        return visitor.visit(this);
    }

}