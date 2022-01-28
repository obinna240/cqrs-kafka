package com.ob.cqrs.core.commands;

/**
 * Functional interface which handles all types of commands
 * @param <T>
 */
@FunctionalInterface
public interface CommandHandlerMethod<T extends BaseCommand> {
    void handle(T command);
}
