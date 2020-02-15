package cookiedragon.luchadora.managers;

import cookiedragon.eventsystem.EventDispatcher;
import cookiedragon.luchadora.util.Globals;
import org.apache.commons.lang3.mutable.MutableFloat;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * @author cookiedragon234 02/Jan/2020
 */
public class PerspectiveManager implements Globals
{
	private static final Set<Consumer<MutableFloat>> yawModifiers = new HashSet<>();
	private static final Set<Consumer<MutableFloat>> pitchModifiers = new HashSet<>();
	
	public static float getYaw()
	{
		MutableFloat yaw = new MutableFloat(mc.player.rotationYaw);
		yawModifiers.forEach(modifier -> modifier.accept(yaw));
		return yaw.floatValue();
	}
	
	public static float getPitch()
	{
		MutableFloat pitch = new MutableFloat(mc.player.rotationPitch);
		pitchModifiers.forEach(modifier -> modifier.accept(pitch));
		return pitch.floatValue();
	}
	
	public static void registerYawModifier(Consumer<MutableFloat> modifier)
	{
		yawModifiers.add(modifier);
	}
	
	public static void registerPitchModifier(Consumer<MutableFloat> modifier)
	{
		pitchModifiers.add(modifier);
	}
	
	public static void init()
	{
		EventDispatcher.Companion.register(PerspectiveManager.class);
		EventDispatcher.Companion.subscribe(PerspectiveManager.class);
	}
}
