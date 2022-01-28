package com.ob.user.cmd.domain;

import com.ob.cqrs.core.domain.AggregateRoot;
import com.ob.user.cmd.api.commands.RegisterUserCommand;
import com.ob.user.common.events.UserRegisteredEvent;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserAggregate extends AggregateRoot {
    private Boolean active;
    private double balance;

    public UserAggregate(RegisterUserCommand registerUserCommand) {
        raiseEvent(UserRegisteredEvent.builder()
                .id(registerUserCommand.getId())
                .userName(registerUserCommand.getUserName())
                .build());
    }
}
