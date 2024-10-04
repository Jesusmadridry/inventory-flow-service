package com.inventory.service;

import com.inventory.repository.InventoryFlowRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;

@RequiredArgsConstructor
@Slf4j
public class ReportService {
    private final InventoryFlowRepository inventoryFlowRepository;



    @Scheduled(cron = "${inventory.report.cron}")
    public void dailyInventoryReport() {
        log.debug("Daily Inventory Report");
    }

}
