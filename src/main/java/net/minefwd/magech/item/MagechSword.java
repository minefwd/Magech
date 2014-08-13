package net.minefwd.magech.item;

public class MagechSword extends MagechItems
{
    private float field_150934_a;

    public MagechSword() {
        super();
        this.setUnlocalizedName("magechsword");
        this.setMaxStackSize(1);
        this.isDamageable();
        this.field_150934_a = 5.0F;
    }
}