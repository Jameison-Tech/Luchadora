package cookiedragon.luchadora.module.player

import cookiedragon.eventsystem.Subscriber
import cookiedragon.luchadora.event.entity.AllowInteractEvent
import cookiedragon.luchadora.module.AbstractModule
import cookiedragon.luchadora.module.Category

/**
 * @author cookiedragon234 11/Jan/2020
 */
class MultiTaskModule : AbstractModule("MultiTask", "Perform multiple actions at once", Category.PLAYER) {
	@Subscriber
	private fun allowInteract(event: AllowInteractEvent) {
		event.isUsingItem = false
	}
}

