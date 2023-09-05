package main;

import java.util.Random;

public enum Item {
    //Equipements
    BATON("Baton", "Arme", "atk", 5),
    MATRAQUE("Matraque", "Arme", "atk", 20),
    PISTOLET("Pistolet", "Arme", "atk", 35),
    OREILLERS("Tenue en oreillers", "Armure", "def", 5),
    GILET("Gilet", "Armure", "def", 15),
    SUIT("Tenue oficielle de livreur", "Armure", "def", 25),
    CHAUSSETTES("Chaussettes", "Accessoire", "speed", 20),
    SCOOTER("Scooter", "Accessoire", "speed", 45),
    LUNETTES("Lunettes de soleil", "Accessoire", "stealth", 15),
    CARTON("Carto,", "Accessoire", "stealth", 35),
    //Consommables
    CHAMPIGNON("Champignon", "hp", 30),
    POMME("Pomme", "mana", 20),
    PIZZA("Pizza", "hp", 75),
    MOUNTAINDEW("Mountain Dew", "mana", 75),
    STEROIDES("Stéroïdes", "atk", 10),
    TACOS("Tacos","def",15),
    KEBAB("Kebab","atk",50),
    BURGER("Burger","mana",30),
    RIZ("Un seul grain de riz","hp",1),
    SUSHI("Sushi","stealth",20),
    CAFE("Café","speed",25);

    private String nom;
    private boolean cons;
    private String type;
    private String modifiedStat;
    private int points;

    //Constructeur d'Item équipement
    private Item(String nom, String type, String modifiedStat, int points){
        this.nom = nom;
        this.cons = false;
        this.type = type;
        this.modifiedStat = modifiedStat;
        this.points = points;
    }

    //Constructeur d'Item consommable
    private Item(String nom, String modifiedStat, int points){
        this.nom = nom;
        this.cons = true;
        this.modifiedStat = modifiedStat;
        this.points = points;
    }

    public String getNom(){
        return nom;
    }

    public boolean getCons(){
        return cons;
    }

    public String getType(){
        if (!cons){
            return type;
        }
        return null;
    }

    public String getModifiedStat(){
        return modifiedStat;
    }

    public int getpoints(){
        return points;
    }

    @Override
    public String toString(){
        String str = nom + ": + " + points + " " + modifiedStat;
        if (cons){
            str += " [Consommable]";
        } else {
            str += " [" + type + "]";
        }
        return str;
    }

    public static Item randomObjet(){
        return Item.values()[new Random().nextInt(Item.values().length)];
    }
}