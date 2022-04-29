package com.appsdeveloperblog.store.ProductsService.command;

import java.math.BigDecimal;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class CreateProductCommand {
	
	@TargetAggregateIdentifier
	String productId;
	String title;
	BigDecimal price;
	Integer quantity;
}
