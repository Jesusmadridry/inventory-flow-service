package com.inventory.config;

import com.inventory.mapper.InventoryFlowMapper;
import com.inventory.repository.InventoryFlowRepository;
import com.inventory.service.InventoryFlowService;
import com.inventory.repository.ProductRepository;
import com.inventory.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class InventoryConfig {
    private final InventoryFlowRepository inventoryFlowRepository;
    private final ProductRepository productRepository;
    private final InventoryFlowMapper inventoryFlowMapper;

    @Bean
    public InventoryFlowService inventoryFlowService() {
        return new InventoryFlowService(inventoryFlowRepository, productRepository, inventoryFlowMapper);
    }

    @Bean
    public ReportService reportService() {
        return new ReportService(inventoryFlowRepository);
    }
}
