package com.ob.cqrs.core.infrastructure;

import com.ob.cqrs.core.commands.BaseCommand;
import com.ob.cqrs.core.commands.CommandHandlerMethod;

public interface CommandDispatcher {

    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    void send(BaseCommand command);
}
