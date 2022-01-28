package com.ob.cqrs.core.domain;

import com.ob.cqrs.core.events.BaseEvents;
import lombok.extern.slf4j.Slf4j;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public abstract class AggregateRoot {

    protected String id;

    private int version = -1;

    //will contain all changes made to the aggregate as events
    private final List<BaseEvents> changes = new ArrayList<>();

    public String getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public List<BaseEvents> getUncommittedChanges() {
        return this.changes;
    }

    public void markChangesAsCommitted() {
        this.changes.clear();
    }

    protected void applyChange(BaseEvents event, Boolean isNewEvent) {
        try {
            var method = getClass().getDeclaredMethod("apply", event.getClass());
            method.setAccessible(true);
            method.invoke(this, event);
        }
        catch (NoSuchMethodException e) {
            e.printStackTrace();
            log.warn(MessageFormat.format("Apply method not found in the aggregate for {0}", event.getClass().getName()));
        }
        catch (Exception e) {
            log.error("Error applying event to aggregate", e);
        }
        finally {
            if(isNewEvent) {
                changes.add(event);
            }
        }
    }

    public void raiseEvent(BaseEvents events) {
        applyChange(events, true);
    }

    public void replayEvents(Iterable<BaseEvents> events) {
        events.forEach(event -> applyChange(event, false));
    }

}
