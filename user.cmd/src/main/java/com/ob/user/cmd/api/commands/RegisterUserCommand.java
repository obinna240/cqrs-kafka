package com.ob.user.cmd.api.commands;

import com.ob.cqrs.core.commands.BaseCommand;
import com.ob.user.common.dto.UserType;
import lombok.Data;

@Data
public class RegisterUserCommand extends BaseCommand {

    private String userName;
    private UserType userType;
    private Double userDeposit;
}
