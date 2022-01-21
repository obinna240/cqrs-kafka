package com.ob.user.cmd.api.commands;

import com.ob.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class DefundPackageCommand extends BaseCommand {

    private Double amount;
}
