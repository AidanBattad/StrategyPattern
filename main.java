public class Main {
    public static class SwingSword implements AttackStrategy
    {
        @Override
        public void attack()
        {
            System.out.println("Knight attacks with a sword!");
        }
    }
    public static class CastSpell implements AttackStrategy
    {
        @Override
        public void attack()
        {
            System.out.println("Wizard casts a spell!");
        }
    }

    // Archer specific attack strategy
    public static class ShootArrow implements AttackStrategy
    {
        @Override
        public void attack()
        {
            System.out.println("Archer shoots an arrow!");
        }
    }

    // Knight specific defense strategies
    public static class Shield implements DefenseStrategy
    {
        @Override
        public void defend()
        {
            System.out.println("Using a shield to defend!");
        }
    }

    public class Dodge implements DefenseStrategy
    {
        @Override
        public void defend()
        {
            System.out.println("Dodging to avoid attack!");
        }
    }

    public class CreateMagic implements DefenseStrategy
    {
        @Override
        public void defend()
        {
            System.out.println("Creating a magic barrier for defense!");
        }
    }

    // Wizard specific defense strategy
    public static class MagicBarrier implements DefenseStrategy
    {
        @Override
        public void defend()
        {
            System.out.println("Creating a magic barrier for defense!");
        }
    }

    // Archer specific defense strategy
    public static class ShieldDefense implements DefenseStrategy
    {
        @Override
        public void defend()
        {
            System.out.println("Using a shield to defend!");
        }
    }

}
