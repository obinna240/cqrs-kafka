package com.ob.cqrs.core.events;

import com.ob.cqrs.core.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class BaseEvents extends Message {
    //to enable us track versions across aggregates
    private int version;
}
