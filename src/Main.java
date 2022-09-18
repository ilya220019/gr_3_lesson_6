public class Main {
    public static void main(String[] args) {

Boss boss = new Boss();
boss.setHealth(1000);
       boss.setDamage(50);
      boss.getWeapon().setWeaponName("AK-47");
      boss.getWeapon().setFirearms(WeaponType.FIREARMS);
        System.out.println("Boss health = " + boss.getHealth() + ";" + " Boss damage = " + boss.getDamage() + ";" + " Weapon name " + boss.getWeapon().getWeaponName() + "; " + "Type of Boss's weapon = " +
                boss.getWeapon().getFirearms());
        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(100);
        skeleton.setDamage(50);
        skeleton.setNumberOfArrow(25);
        skeleton.getWeapon().setWeaponName("- Bow");
        skeleton.getWeapon().setFirearms(WeaponType.COLD_WEAPON);
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(90);
        skeleton1.setDamage(60);
        skeleton1.setNumberOfArrow(20);
        skeleton1.getWeapon().setWeaponName("- Bow");
        skeleton1.getWeapon().setFirearms(WeaponType.COLD_WEAPON);


        System.out.println(skeleton.printInfo());
        System.out.println(skeleton1.printInfo());


    }

}