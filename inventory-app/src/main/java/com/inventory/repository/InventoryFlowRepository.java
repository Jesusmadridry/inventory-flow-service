package com.inventory.repository;

import com.inventory.persist.InventoryFlow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryFlowRepository extends JpaRepository<InventoryFlow, Long> {
}
