package com.equivi.demailer.data;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class DataPageable implements Serializable{


    private static final long serialVersionUID = 7368319039220422153L;

    public Pageable getPageable(int firstIndex, int maxRecords, Sort sort) {
        Pageable pageable = new PageRequest(firstIndex, maxRecords, sort);

        return pageable;
    }

    public Sort getSort(String fieldName, Sort.Direction sortDirection) {
        return new Sort(sortDirection, fieldName);
    }
}
