public class Card {
    private String name;
    private Category[] categories = new Category[5];

    public Card(String name, int speed, int weight, int era, int legs, int wings){
        this.name = name;

        categories[0] = new Category("Speed", speed);
        categories[1] = new Category("Weight", weight);
        categories[2] = new Category("Era", era);
        categories[3] = new Category("Legs", legs);
        categories[4] = new Category("Wings", wings);
    }

    public String getName(){
        return name;
    }

    public Category getCategory(String name){
        for(Category c:categories){
            if(c.getName() == name) return c;
        }
        return null;
    }

    public boolean isBetterThan(Card card, String name){
        return this.getCategory(name).getValue() > card.getCategory(name).getValue();
    }
}
