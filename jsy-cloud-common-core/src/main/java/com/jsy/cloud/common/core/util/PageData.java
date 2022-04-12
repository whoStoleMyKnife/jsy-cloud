package com.jsy.cloud.common.core.util;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.List;

@Builder
public class PageData<T> {

  private long pageSize;
  private long pageNumber;
  private long total;
  private List<T> data;

  public static <T> PageData<T> of(Long pageSize, Long pageNumber, Long total, List<T> data) {
    return PageData.<T>builder()
        .pageSize(pageSize)
        .pageNumber(pageNumber)
        .total(total)
        .data(data)
        .build();
  }
}
