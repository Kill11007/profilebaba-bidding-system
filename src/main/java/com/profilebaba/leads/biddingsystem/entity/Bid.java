package com.profilebaba.leads.biddingsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

@Table(name = "bids")
@Entity
@Getter
@Setter
public class Bid {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @ManyToOne
  private Category category;

  private BigDecimal lastBidPricePerLead;
  private BigDecimal openBidPricePerLead;
  private Integer quantity;
  private Integer openQuantity;
  private Integer expirationHours;
  @ManyToOne
  @JoinColumn(name = "lastBidVendorId")
  private Vendor vendor;
  private Timestamp createdDateTime;
  private Timestamp updatedDateTime;
}
