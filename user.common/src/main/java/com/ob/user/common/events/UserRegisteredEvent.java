package com.ob.user.common.events;

import com.ob.cqrs.core.events.BaseEvents;
import com.ob.user.common.dto.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Instant;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisteredEvent extends BaseEvents {

    private String id;
    private String userName;
    private Instant dateUserCreated;
    private UserType userType;
    private Double userDeposit;
}
