public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character("Knight", new Main.SwingSword(), new Main.Shield());
        Character wizard = new Character("Wizard", new Main.CastSpell(), new Main.MagicBarrier());
        Character archer = new Character("Archer", new Main.ShootArrow(), new Main.ShieldDefense());

        knight.attack();
        knight.defend();

        wizard.attack();
        wizard.defend();

        archer.attack();
        archer.defend();
    }
}

