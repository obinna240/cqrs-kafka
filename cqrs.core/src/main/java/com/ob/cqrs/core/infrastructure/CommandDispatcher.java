package com.ob.cqrs.core.infrastructure;

import com.ob.cqrs.core.commands.BaseCommand;
import com.ob.cqrs.core.commands.CommandHandlerMethod;

/**
 * CommandDispatcher is essentially our mediator
 * responsible for dispatching commands
 */
public interface CommandDispatcher {

    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    void send(BaseCommand command);
}
