package com.ob.user.cmd.api.commands;


import com.ob.cqrs.core.commands.BaseCommand;

public class DeleteUserCommand extends BaseCommand {

    public DeleteUserCommand(String id) {
        super(id);
    }
}
