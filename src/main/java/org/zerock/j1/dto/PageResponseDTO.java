package org.zerock.j1.dto;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import lombok.Data;

@Data
public class PageResponseDTO<E> {
  
  private List<E> dtoList;

  private long totalCount;

  private List<Integer> pageNums;

  private boolean prev, next;

  private PageRequestDTO requestDTO;

  public PageResponseDTO(List<E> dtoList, long totalCount, PageRequestDTO pageRequestDTO){
    
    this.dtoList = dtoList;
    this.totalCount = totalCount;
    this.requestDTO = pageRequestDTO;


  }


  
}
