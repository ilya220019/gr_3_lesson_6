public class Skeleton extends Boss {
    private int numberOfArrow;

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    public void setNumberOfArrow(int numberOfArrow) {
        this.numberOfArrow = numberOfArrow;
    }
    @Override
    public String printInfo(){
        return "Skeleton health = " + this.getHealth() + ";" + " Skeleton damage = " + this.getDamage() + ";" + " Weapon name " + this.getWeapon().getWeaponName() + "; " + "Type of Skeleton's weapon = " +
                this.getWeapon().getFirearms()+ "; " + " Number Of Arrow = " + numberOfArrow;

    }

}
