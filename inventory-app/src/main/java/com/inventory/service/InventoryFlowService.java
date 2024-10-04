package com.inventory.service;

import com.inventory.mapper.InventoryFlowMapper;
import com.inventory.repository.InventoryFlowRepository;
import com.inventory.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import com.inventory.model.InventoryFlowServiceException;
import com.inventory.model.ProductFlow;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class InventoryFlowService {
    private final InventoryFlowRepository inventoryFlowRepository;
    private final ProductRepository productRepository;
    private final InventoryFlowMapper inventoryFlowMapper;

    public Mono<Long> registerProductFlow(ProductFlow productFlow) {
        return
            Mono.just(productFlow)
                .flatMap(productFlowForRegistering -> {
                    try {
                        return
                            productRepository.findByCode(productFlow.getCode())
                                .map(productDb -> {
                                    var inventoryFlow = inventoryFlowMapper.fromProductFlow(productFlow);
                                    var newInventoryFlow = inventoryFlowRepository.save(inventoryFlow);
                                    return Mono.just(newInventoryFlow.getId());
                                }).orElseGet(() -> Mono.error(new InventoryFlowServiceException("There was an error trying to find the product code related to the Product Flow")));
                    } catch (Exception e) {
                        return Mono.error(new InventoryFlowServiceException("There was an error trying to register the Product Flow"));
                    }
                })
                .switchIfEmpty(Mono.error(new InventoryFlowServiceException("Product Flow must not be NULL to be registered")));
    }
}
