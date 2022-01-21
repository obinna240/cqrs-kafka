package com.ob.user.common.events;

import com.ob.cqrs.core.events.BaseEvents;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class UserDeletedEvent extends BaseEvents {
}
