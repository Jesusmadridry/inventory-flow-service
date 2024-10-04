package com.inventory.controller;

import com.inventory.service.InventoryFlowService;
import lombok.RequiredArgsConstructor;
import com.inventory.model.ProductFlow;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("inventory")
public class InventoryFlowController {
    private final InventoryFlowService inventoryFlowService;

    @PostMapping
    public Mono<Long> registerProductFlow(@RequestBody ProductFlow productFlow){
        return inventoryFlowService.registerProductFlow(productFlow);
    }

}
