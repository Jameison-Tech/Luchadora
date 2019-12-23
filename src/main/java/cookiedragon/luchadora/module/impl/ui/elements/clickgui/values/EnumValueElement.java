package cookiedragon.luchadora.module.impl.ui.elements.clickgui.values;

import cookiedragon.luchadora.module.impl.ui.elements.clickgui.ModuleElement;
import cookiedragon.luchadora.module.impl.ui.elements.clickgui.ValueElement;
import cookiedragon.luchadora.util.Vec2f;
import cookiedragon.luchadora.value.values.EnumValue;

/**
 * @author cookiedragon234 22/Dec/2019
 */
public class EnumValueElement extends ValueElement<EnumValue>
{
	public EnumValueElement(EnumValue value, ModuleElement categoryElement)
	{
		super(value, categoryElement);
	}
	
	@Override
	public void render(Vec2f mousePos)
	{
	
	}
	
	@Override
	public boolean mouseClick(Vec2f mousePos, int mouseID)
	{
		return false;
	}
}
