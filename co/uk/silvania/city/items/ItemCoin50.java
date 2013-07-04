package co.uk.silvania.city.items;

import co.uk.silvania.city.FlenixCities;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class ItemCoin50 extends Item {

	public ItemCoin50(int id) {
		super(id);
		this.setMaxStackSize(50);
		this.setCreativeTab(FlenixCities.tabEcon);
	}
	

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon("City:Coin50");
	}
}
