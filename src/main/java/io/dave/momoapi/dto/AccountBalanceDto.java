package io.dave.momoapi.dto;

public record AccountBalanceDto(
      String availableBalance,
      String currency
) {
}