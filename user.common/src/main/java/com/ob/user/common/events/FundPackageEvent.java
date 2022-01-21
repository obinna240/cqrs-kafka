package com.ob.user.common.events;

import com.ob.cqrs.core.events.BaseEvents;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class FundPackageEvent extends BaseEvents {

    private double amount;
}
