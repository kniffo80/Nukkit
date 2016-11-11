/**
 * EntityInteractEvent.java
 * 
 * Created on 16:16:54
 */
package cn.nukkit.event.entity;

import cn.nukkit.Player;
import cn.nukkit.entity.Entity;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;

/**
 * This is a new Event (since 0.16) which is sent to all plugins when interacting with an entity occured (for taming, feeding etc. pp)
 * 
 * It contains the player that fired this event and the entity on which the interaction should take place.
 * 
 * @author <a href="mailto:kniffman@googlemail.com">kniffo80</a>
 */
public class EntityInteractEvent extends EntityEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private final Player             player;

    public static HandlerList getHandlers() {
        return handlers;
    }

    public EntityInteractEvent(Entity entity, Player player) {
        this.entity = entity;
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

}
