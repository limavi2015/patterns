package Behabioral.visitor_pattern;

interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
